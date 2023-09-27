package com.example.checkpoint.controller;

import com.example.checkpoint.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
    @GetMapping("/insert-meal-test")
    public ResponseEntity<?> insertMealTest(){
        testService.insertMealTest();
        testService.test();
        return ResponseEntity.ok().build();
    }
}
