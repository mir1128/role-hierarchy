package com.example.rolehierarchy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/user")
    public String userInterface() {
        return sampleService.userMethod();
    }

    @GetMapping("/admin")
    public String adminInterface() {
        return sampleService.adminMethod();
    }
}
