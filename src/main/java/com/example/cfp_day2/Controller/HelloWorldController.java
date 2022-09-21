package com.example.cfp_day2.Controller;

import com.example.cfp_day2.entity.User;
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

    @GetMapping("/darsh")
    public String saydarsh()
    {
        return "“Hello from BridgeLabz”";
    }

    //UC2
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return " Hello " + name + "!";
    }

    //UC3
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return " Hello " + name + "!" ;
    }
    //UC4
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + "" + user.getLastName() + "!";

    }
}