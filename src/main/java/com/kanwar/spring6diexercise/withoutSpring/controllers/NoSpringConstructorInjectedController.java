package com.kanwar.spring6diexercise.withoutSpring.controllers;

import com.kanwar.spring6diexercise.withoutSpring.services.GreetingService;

public class NoSpringConstructorInjectedController {

    private final GreetingService greetingService;

    public NoSpringConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
