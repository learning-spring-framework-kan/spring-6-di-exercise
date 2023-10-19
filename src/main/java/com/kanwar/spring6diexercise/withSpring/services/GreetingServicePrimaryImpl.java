package com.kanwar.spring6diexercise.withSpring.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimaryImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi from Greeting Primary Service Impl..";
    }
}
