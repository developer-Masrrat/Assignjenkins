package com.nagarro.assignForJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String message(){
        String message = " My jenkins spring boot app.";
        return message;
    }
}
