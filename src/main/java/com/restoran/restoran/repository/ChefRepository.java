package com.restoran.restoran.repository;

import com.restoran.restoran.entity.ChefEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends JpaRepository<ChefEntity, Long> {
}