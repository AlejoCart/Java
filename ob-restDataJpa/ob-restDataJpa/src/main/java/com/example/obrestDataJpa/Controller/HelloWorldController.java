package com.example.obrestDataJpa.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final String PATH="/Hola";
    @GetMapping(PATH)
    //@RequestMapping(value="/hola")
    public String holas(){
        return "Hola mundo, que tal tu dia? Todo bien por casa?";
    }

}
