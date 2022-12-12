package com.example.javaexcerise2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    /**
     * GET /name : returns “My name is .......”
     * GET /age : returns “My age is ........”
     * GET /check/status : returns “Everything OK”
     * GET /health : returns “Server health is up and running”
     */

    @GetMapping("/name")
    public String name() {
        return "My name is Saud Alshamsi";
    }

    @GetMapping("/age")
    public String age() {
        return "My age is 30";
    }

    @GetMapping("/check/status")
    public String checkStatus() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }
}
