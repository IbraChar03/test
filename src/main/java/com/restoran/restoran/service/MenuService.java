package com.restoran.restoran.service;

import com.restoran.restoran.entity.ChefEntity;
import com.restoran.restoran.entity.MenuEntity;
import com.restoran.restoran.repository.ChefRepository;
import com.restoran.restoran.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository  menuRepository;
    public List<MenuEntity> getAllMenu() {
        return menuRepository.findAll();
    }

    public MenuEntity addMenu(MenuEntity menu) {
        return menuRepository.save(menu);
    }
}
