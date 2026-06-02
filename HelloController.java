package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World! Java App Deployed Successfully to AWS ECS using GitHub Actions CI/CD! 🚀</h1>";
    }
}
