package com.test.service;

import com.test.dto.request.PointRequestDto;
import com.test.entity.Point;
import com.test.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointService {
    private final PointRepository pointRepository;
    @Autowired
    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public Point createPoint(PointRequestDto request) {
        Point point = new Point();
        point.setX(request.getX());
        point.setY(request.getY());
        return pointRepository.save(point);
    }
    public void deletePoint(String id){
        pointRepository.deleteById(Long.parseLong(id));
    }

    public List<Point> getPoints(){
        return pointRepository.findAll();
    }

    public boolean existsById(String id) {
        return pointRepository.existsById(Long.valueOf(id));
    }
}
