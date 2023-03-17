package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class DemoControllerTest {

//    @Autowired
    @InjectMocks
    DemoControllerImpl controller;

    @Mock
    DemoService service;

    @BeforeEach
    private void setup() {
        // nothing
    }

    @Test
    void returnCapital() {
        when(service.doService(any())).thenReturn("ABC");
        assertTrue("ABC".equals(controller.hello("abc")));
    }

    @Test
    void returnCapitalFail() {
        when(service.doService(any())).thenReturn("ABC");
        assertFalse("abc".equals(controller.hello("abc")));
    }
}
