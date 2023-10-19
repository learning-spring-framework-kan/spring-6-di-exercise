package com.kanwar.spring6diexercise.withoutSpring.controllers;

import com.kanwar.spring6diexercise.withoutSpring.services.GreetingService;

public class NoSpringSetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
