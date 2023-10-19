package com.kanwar.spring6diexercise.withSpring.controllers;

import com.kanwar.spring6diexercise.withSpring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringConstructorInjectedController {

    private final GreetingService greetingService;

    @Autowired
    public SpringConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayHi();
    }
}
