package com.example.demo1.controllers;
import com.example.demo1.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return demoService.getHelloService();
    }
}
