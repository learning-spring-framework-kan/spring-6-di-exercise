package com.kanwar.spring6diexercise.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class DataSourceServicePRODImpl implements DataSourceService {

    @Override
    public String getEnv() {
        return "PRODUCTION : ENV";
    }
}
