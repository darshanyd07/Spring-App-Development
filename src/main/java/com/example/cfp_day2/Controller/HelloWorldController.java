package com.example.cfp_day2.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hello")
public class HelloWorldController {

    @GetMapping("/get")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/get1")
    public String hello1() {
        return "Hello bridgelabzs";

    }

    //UC1
    @GetMapping("/web")
    public String sayhello()
    {
        return "hello";
    }

    //UC2
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return " Hello " + name + "!";
    }
}