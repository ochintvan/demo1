package com.example.demo1.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "Jai Swaminarayan1";
    }
}
