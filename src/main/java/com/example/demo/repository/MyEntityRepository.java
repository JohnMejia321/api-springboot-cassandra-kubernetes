package com.example.demo.repository;

import com.example.demo.entity.MyEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends CassandraRepository<MyEntity, String> {
}

