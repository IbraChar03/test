package com.restoran.restoran.service;

import com.restoran.restoran.entity.MenuEntity;
import com.restoran.restoran.entity.ReviewEntity;
import com.restoran.restoran.repository.MenuRepository;
import com.restoran.restoran.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    public List<ReviewEntity> getAllReviews() {
        return reviewRepository.findAll();
    }

    public ReviewEntity addReview(ReviewEntity review) {
        return reviewRepository.save(review);
    }
}
