package com.kanwar.spring6diexercise.assignment.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class DataSourceServiceUATImpl implements DataSourceService {

    @Override
    public String getEnv() {
        return "USER ACCEPTANCE TEST : ENV";
    }
}
