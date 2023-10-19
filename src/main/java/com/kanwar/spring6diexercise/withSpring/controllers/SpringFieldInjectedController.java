package com.kanwar.spring6diexercise.withSpring.controllers;

import com.kanwar.spring6diexercise.withSpring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SpringFieldInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHi();
    }
}
