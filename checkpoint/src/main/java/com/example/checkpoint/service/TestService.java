package com.example.checkpoint.service;

import com.example.checkpoint.entity.EntityTest;
import com.example.checkpoint.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestService {
    private TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void insertMealTest(){
        testRepository.save(new EntityTest("Test Meal", "Very tasty", 4.88,true));
    }
    public void deleteMealTest(long id){
        testRepository.deleteById(id);
    }
    public void addMeal(EntityTest meal){
       testRepository.save(meal);
    }
    public List<EntityTest> getMeals(){
        return testRepository.findAll();
    }
    public void test(){
        testRepository.findByName("Chicken").forEach(System.out::println);
        System.out.println();
    }
}
