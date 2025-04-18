package com.test.controller;

import com.test.dto.request.PointRequestDto;
import com.test.dto.response.PointResponseDto;
import com.test.entity.Point;
import com.test.mapper.PointMapper;
import com.test.service.PointService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class SpaceController {
    private final PointService pointService;
    private final PointMapper pointMapper;

    public SpaceController(PointService pointService, PointMapper pointMapper) {
        this.pointService = pointService;
        this.pointMapper = pointMapper;
    }

    @PostMapping("/point")    // create a point
    public ResponseEntity<PointResponseDto> createPoint(@RequestBody PointRequestDto request){
        return ResponseEntity.ok(pointMapper.toResponseDto(pointService.createPoint(request)));
    }
    @GetMapping("/space") // get all points
    public ResponseEntity<List<PointResponseDto>> getPoints(){
        var list = pointService.getPoints();
        return ResponseEntity.ok(pointMapper.toResponseListDto(list));
    }

    @DeleteMapping("/space")  // delete all points
    public ResponseEntity<?> deletePoints(){
        pointService.deletePoints();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/lines/{n}") // get all line segments passing through at least N points
    public ResponseEntity<List<Set<PointResponseDto>>> getLineSegments(@PathVariable String n) {
        List<Set<Point>> lineSegments = pointService.getLineSegments(Integer.valueOf(n));
        List<Set<PointResponseDto>> response = new ArrayList<>();

        for (Set<Point> segment : lineSegments) {
            Set<PointResponseDto> responseSegment = new HashSet<>();
            for (Point point : segment) {
                responseSegment.add(pointMapper.toResponseDto(point));
            }
            response.add(responseSegment);
        }

        return ResponseEntity.ok(response);
    }
}
