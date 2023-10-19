package com.kanwar.spring6diexercise.withoutSpring.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello from the base Service Impl..";
    }
}
