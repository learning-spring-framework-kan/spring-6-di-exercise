package com.kanwar.spring6diexercise.withoutSpring.controllers;

import com.kanwar.spring6diexercise.withoutSpring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoSpringFieldInjectedControllerTest {

    NoSpringFieldInjectedController controller;

    @BeforeEach
    void setUp() {
        controller =  new NoSpringFieldInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}