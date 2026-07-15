package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerUnitTest {

    @Test
    void styHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("Dolly", model);
        assertEquals("welcome", result);
        assertEquals("Dolly", model.asMap().get("user"));
    }

}
