package com.kanwar.spring6diexercise.withSpring.controllers;

import com.kanwar.spring6diexercise.withSpring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringSetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayHi();
    }
}
