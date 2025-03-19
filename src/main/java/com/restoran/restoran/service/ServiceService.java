package com.restoran.restoran.service;

import com.restoran.restoran.entity.ServiceEntity;
import com.restoran.restoran.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    public ServiceEntity addService(ServiceEntity service) {
        return serviceRepository.save(service);
    }
}