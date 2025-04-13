package com.test.service;

import com.test.dto.request.PointRequestDto;
import com.test.entity.Point;
import com.test.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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

    public List<Set<Point>> getLineSegments(Integer n) {
        List<Point> points = pointRepository.findAll();
        List<Set<Point>> result = new ArrayList<>();

        Set<String> seen = new HashSet<>(); // per evitare duplicati

        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point p1 = points.get(i);
                Point p2 = points.get(j);

                Set<Point> segment = new HashSet<>();
                // trova tutti i punti sulla retta da p1 e p2
                for (Point p : points) {
                    if (isOnLine(p, p1, p2)) {
                        segment.add(p);
                    }
                }

                if (segment.size() >= n) {
                    // crea firma per evitare duplicati
                    String key = segment.stream()
                            .sorted(Comparator.comparing(Point::getX).thenComparing(Point::getY))
                            .map(p -> p.getX() + "," + p.getY())
                            .collect(Collectors.joining(";"));

                    if (!seen.contains(key)) {
                        seen.add(key);
                        result.add(segment);
                    }
                }
            }
        }

        return result;
    }
    // verifica se il punto p si trova nella stessa retta di p1 e p2
    private boolean isOnLine(Point p, Point p1, Point p2) {
        int x0 = p.getX(), y0 = p.getY();
        int x1 = p1.getX(), y1 = p1.getY();
        int x2 = p2.getX(), y2 = p2.getY();

        return (y2 - y1) * (x0 - x1) == (x2 - x1) * (y0 - y1);
    }
}
