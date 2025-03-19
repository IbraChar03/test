package com.restoran.restoran.controller;

import com.restoran.restoran.entity.ServiceEntity;
import com.restoran.restoran.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "http://localhost:4200")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<ServiceEntity> getAllServices() {
        return serviceService.getAllServices();
    }

    @PostMapping
    public ServiceEntity addService(@RequestBody ServiceEntity service) {
        return serviceService.addService(service);
    }
}
