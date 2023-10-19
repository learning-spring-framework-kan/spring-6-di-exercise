package com.kanwar.spring6diexercise.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DataSourceServiceDEVImpl implements DataSourceService {

    @Override
    public String getEnv() {
        return "DEVELOPMENT ENV";
    }
}
