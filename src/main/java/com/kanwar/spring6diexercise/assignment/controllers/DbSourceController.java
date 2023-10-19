package com.kanwar.spring6diexercise.assignment.controllers;

import com.kanwar.spring6diexercise.assignment.services.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DbSourceController {

    private final DataSourceService dataSourceService;

    public DbSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getEnv(){
        return dataSourceService.getEnv();
    }
}
