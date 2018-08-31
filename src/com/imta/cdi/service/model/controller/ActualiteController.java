package com.imta.cdi.service.model.controller;


import com.imta.cdi.service.model.model.ActualiteEntity;
import com.imta.cdi.service.model.repository.ActualiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActualiteController {
    @Autowired
    private ActualiteRepository actualiteRepository;

    @GetMapping("/actu/all")
    List<ActualiteEntity> all(){
        return actualiteRepository.findAll();
    }
}
