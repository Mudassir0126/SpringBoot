package com.SpringProject.demo.testRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {


@GetMapping("/hello")
public String Hello(){
    return "hello";
}

    @GetMapping("/")
    public static String Hey(){
        return "hey";
    }
}
