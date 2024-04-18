package dw.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/sayhello")
    public String hello() {
        return "Hello, World!";
    }
}
