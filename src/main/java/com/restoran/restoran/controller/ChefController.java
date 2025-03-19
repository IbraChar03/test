package com.restoran.restoran.controller;

import com.restoran.restoran.entity.ChefEntity;
import com.restoran.restoran.entity.ServiceEntity;
import com.restoran.restoran.service.ChefService;
import com.restoran.restoran.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chefs")
@CrossOrigin(origins = "http://localhost:4200")
public class ChefController {
    @Autowired
    private ChefService chefService;

    @GetMapping
    public List<ChefEntity> getAllChefs() {
        return chefService.getAllChefs();
    }

    @PostMapping
    public ChefEntity addService(@RequestBody ChefEntity chef) {
        return chefService.addChef(chef);
    }
}
