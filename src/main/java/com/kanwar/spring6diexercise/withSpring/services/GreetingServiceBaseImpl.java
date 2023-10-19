package com.kanwar.spring6diexercise.withSpring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceBaseImpl implements GreetingService {

    @Override
    public String sayHi() {
        return "Hi from Greeting Base Service Impl..";
    }
}
