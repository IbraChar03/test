package com.restoran.restoran.repository;

import com.restoran.restoran.entity.ChefEntity;
import com.restoran.restoran.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
}
