package com.example.demo.service;

import java.util.Locale;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public String doService(String arg) {
        return arg.toUpperCase(Locale.ROOT);
    }
}
