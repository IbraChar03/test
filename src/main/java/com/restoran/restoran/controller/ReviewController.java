package com.restoran.restoran.controller;

import com.restoran.restoran.entity.MenuEntity;
import com.restoran.restoran.entity.ReviewEntity;
import com.restoran.restoran.service.MenuService;
import com.restoran.restoran.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@CrossOrigin(origins = "http://localhost:4200")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<ReviewEntity> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public ReviewEntity addReview(@RequestBody ReviewEntity review) {
        return reviewService.addReview(review);
    }
}