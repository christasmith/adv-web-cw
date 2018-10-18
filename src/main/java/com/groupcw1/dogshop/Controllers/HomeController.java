package com.groupcw1.dogshop.Controllers;

import com.groupcw1.dogshop.Dog.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/test")
    public String test() {
        return "THIS IS WORKING";
    }


    @RequestMapping("/dogs")
    public Dog dogs() {
        return new Dog(123,"dog1");
    }
}
