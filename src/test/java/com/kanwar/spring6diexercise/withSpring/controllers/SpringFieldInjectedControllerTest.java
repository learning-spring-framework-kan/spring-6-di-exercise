package com.kanwar.spring6diexercise.withSpring.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringFieldInjectedControllerTest {

    @Autowired
    SpringFieldInjectedController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}