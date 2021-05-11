package com.alishevspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        String name = request.getParameter("name");
        System.out.println(name);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public  String goodbye(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Hello, " + name + " " + surname + "!");
        return "first/goodbye";
    }
}
