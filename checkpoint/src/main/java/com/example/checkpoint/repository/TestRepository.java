package com.example.checkpoint.repository;

import com.example.checkpoint.entity.EntityTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<EntityTest, Long> {
    List<EntityTest> findByName(String name);
    List<EntityTest> findByPriceGreaterThan(double price);

}
