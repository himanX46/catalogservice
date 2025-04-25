package com.himanbayan.productcatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hi")
    public String hiEveryOne(){
        return("Hey Students just do it! ");
    }
}
