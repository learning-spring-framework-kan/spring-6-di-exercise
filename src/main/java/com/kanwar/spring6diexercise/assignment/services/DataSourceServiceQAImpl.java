package com.kanwar.spring6diexercise.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class DataSourceServiceQAImpl implements DataSourceService {

    @Override
    public String getEnv() {
        return "QUALITY ASSURANCE : ENV";
    }
}
