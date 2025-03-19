package com.restoran.restoran.service;

import com.restoran.restoran.entity.ChefEntity;
import com.restoran.restoran.entity.ServiceEntity;
import com.restoran.restoran.repository.ChefRepository;
import com.restoran.restoran.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefService {
    @Autowired
    private ChefRepository chefRepository;
    public List<ChefEntity> getAllChefs() {
        return chefRepository.findAll();
    }

    public ChefEntity addChef(ChefEntity chef) {
        return chefRepository.save(chef);
    }
}
