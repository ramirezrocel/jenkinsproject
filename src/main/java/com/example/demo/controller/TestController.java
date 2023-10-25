package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TestController {

    @GetMapping("/getSquaredValue/{valueTosquare}")
    public Long getSquaredValue(@PathVariable(value="valueTosquare") Long valueTosquare){
        return valueTosquare*valueTosquare;
    }
    
}
