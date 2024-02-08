package com.example.demo.controller;

import com.example.demo.entity.MyEntity;
import com.example.demo.service.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/myentity")
public class MyEntityController {

    private final MyEntityService service;

    @Autowired
    public MyEntityController(MyEntityService service) {
        this.service = service;
    }

    @PostMapping
    public MyEntity createEntity(@RequestBody MyEntity entity) {
        return service.save(entity);
    }
}

