package com.example.demo.controllers;

import org.junit.jupiter.api.Test;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@WebMvcTest(HelloController.class)
public class HelloControllerMockMVCTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void autowiringWorked() {
        assertNotNull(mvc);
    }

    @Test
    void testHelloWithoutName() throws Exception {

        Object uri;
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(model().attribute("user", "World"));


    }

    @Test
    void testHelloWithName() throws Exception {

        Object uri;
        mvc.perform(get("/hello?name={name}", "Dolly"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attribute("user", "Dolly"));


    }

}
