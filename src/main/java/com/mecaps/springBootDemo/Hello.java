package com.mecaps.springBootDemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping("/get")
    public String getGreet() {
        System.out.println("Hello");
        return "Hey Spring Dev!";
    }

    @GetMapping
    public String sumOfTwo() {
        int sum = 50 + 90;
        return "Sum of two number : " + sum;
    }

}

//end point
//http://localhost:8080/hello/get

// what is maven
// Maven is the dependencies management tool that is used to bring a jar file from internet for our project.
