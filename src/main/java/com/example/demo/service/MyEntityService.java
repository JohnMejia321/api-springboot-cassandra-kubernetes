package com.example.demo.service;

import com.example.demo.entity.MyEntity;
import com.example.demo.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyEntityService {

    private final MyEntityRepository repository;

    @Autowired
    public MyEntityService(MyEntityRepository repository) {
        this.repository = repository;
    }

    public MyEntity save(MyEntity entity) {
        return repository.save(entity);
    }
}

