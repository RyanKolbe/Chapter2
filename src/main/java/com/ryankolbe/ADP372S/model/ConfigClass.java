package com.ryankolbe.ADP372S.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean(name = "typical")
    public CalculatorInterface getService() {
        return new CalculatorImplementation();
        }
    }
