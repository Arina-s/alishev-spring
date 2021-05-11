package com.alishevspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        model.addAttribute("name", "My name is " + name);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbye(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "surname", required = false) String surname) {
        System.out.println("Hello, " + name + " " + surname + "!");
        return "first/goodbye";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam(value = "value1", required = false) Integer value1,
                            @RequestParam(value = "value2", required = false) Integer value2,
                            @RequestParam(value = "action", required = false) String action, Model model) {
        model.addAttribute("value1", value1);
        model.addAttribute("value2", value2);
        model.addAttribute("action", action);
        Integer result = null;
        switch (action) {
            case "multiplication":
                result = value1 * value2;
                break;
            case "addition":
                result = value1 + value2;
                break;
            case "subtraction":
                result = value1 - value2;
                break;
            case "division":
                result = value1 / value2;
                break;
        }
        model.addAttribute("result", result);
        return "first/calculation";
    }
}
