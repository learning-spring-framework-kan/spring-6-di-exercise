package com.kanwar.spring6diexercise.withSpring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringConstructorInjectedControllerTest {

    @Autowired
    SpringConstructorInjectedController controller;

    @Test
    void sayHi() {
        System.out.println(controller.sayHi());
    }
}