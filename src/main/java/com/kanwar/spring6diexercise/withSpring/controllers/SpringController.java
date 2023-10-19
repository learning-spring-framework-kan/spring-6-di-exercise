package com.kanwar.spring6diexercise.withSpring.controllers;

import com.kanwar.spring6diexercise.withSpring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringController {

    private final GreetingService greetingService;


    public SpringController(@Qualifier("i18N") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayHi();
    }
}
