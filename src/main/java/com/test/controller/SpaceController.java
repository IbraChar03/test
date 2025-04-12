package com.test.controller;

import com.test.dto.request.PointRequestDto;
import com.test.dto.response.PointResponseDto;
import com.test.mapper.PointMapper;
import com.test.service.PointService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/space")
public class SpaceController {
    private final PointService pointService;
    private final PointMapper pointMapper;

    public SpaceController(PointService pointService, PointMapper pointMapper) {
        this.pointService = pointService;
        this.pointMapper = pointMapper;
    }
    @PostMapping("/point")
    public ResponseEntity<PointResponseDto> createPoint(@RequestBody PointRequestDto request){
        return ResponseEntity.ok(pointMapper.toResponseDto(pointService.createPoint(request)));
    }
}
