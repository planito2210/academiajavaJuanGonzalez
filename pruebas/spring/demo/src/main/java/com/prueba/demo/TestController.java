package com.prueba.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/xideral")
    public String sayHello() {
        return "Hola Mundo";
    }
}
