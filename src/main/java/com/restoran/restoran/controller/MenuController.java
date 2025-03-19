package com.restoran.restoran.controller;

import com.restoran.restoran.entity.MenuEntity;
import com.restoran.restoran.entity.ServiceEntity;
import com.restoran.restoran.service.MenuService;
import com.restoran.restoran.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuEntity> getAllMenu() {
        return menuService.getAllMenu();
    }

    @PostMapping
    public MenuEntity addMenu(@RequestBody MenuEntity menu) {
        return menuService.addMenu(menu);
    }
}
