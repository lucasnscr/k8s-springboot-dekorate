package com.lucasnscr.dekoratestudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dekorate-study")
public class DekorateController {

    @Value("${valueFromMap}")
    String valueFromMap;
    @Value("${valueFromMap}")
    String valueFromEnv;

    @GetMapping("/values")
    public String getValues(){
        return valueFromMap + valueFromEnv;
    }

}
