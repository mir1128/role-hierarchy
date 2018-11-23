package com.example.rolehierarchy;


import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Secured("ROLE_USER")
    public String userMethod() {
        return "user can invoke this method.";
    }

    @Secured("ROLE_ADMIN")
    public String adminMethod() {
        return "admin can invoke this method";
    }
}
