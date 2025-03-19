package com.restoran.restoran.repository;

import com.restoran.restoran.entity.MenuEntity;
import com.restoran.restoran.entity.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
}
