package com.kanwar.spring6diexercise.withoutSpring.controllers;

import com.kanwar.spring6diexercise.withoutSpring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoSpringSetterInjectedControllerTest {

    NoSpringSetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new NoSpringSetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}