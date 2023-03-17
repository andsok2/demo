package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class DemoServiceTest {

    @InjectMocks
    DemoServiceImpl service;

    @Test
    public void returnsCapitalTrue() {
        assertTrue("ABC".equals(service.doService("abc")));
    }

    @Test
    public void returnsCapitalFalse() {
        assertFalse("abc".equals(service.doService("abc")));
    }
}
