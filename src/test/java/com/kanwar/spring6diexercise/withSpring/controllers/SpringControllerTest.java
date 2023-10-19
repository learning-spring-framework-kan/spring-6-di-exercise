package com.kanwar.spring6diexercise.withSpring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("ES")
class SpringControllerTest {

    @Autowired
    SpringController controller;

    @Test
    void sayHi() {
        System.out.println(controller.sayHi());
    }
}