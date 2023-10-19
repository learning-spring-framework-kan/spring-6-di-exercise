package com.kanwar.spring6diexercise.withoutSpring.controllers;

import com.kanwar.spring6diexercise.withoutSpring.services.GreetingService;

public class NoSpringFieldInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
