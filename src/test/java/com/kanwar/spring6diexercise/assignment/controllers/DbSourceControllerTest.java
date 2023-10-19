package com.kanwar.spring6diexercise.assignment.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles({"uat", "ES"})
class DbSourceControllerTest {

    @Autowired
    DbSourceController controller;

    @Test
    void name() {
        System.out.println(controller.getEnv());
    }
}