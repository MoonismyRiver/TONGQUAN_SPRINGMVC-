package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/caculator")
public class CaculatorController {

    @GetMapping("")
    public String caculator() {
        return ("/index");
    }


    @PostMapping("/cacul")
    public ModelAndView cacul(@RequestParam("num1") double num1, @RequestParam("num2") double num2, @RequestParam String caculation) throws Exception{
        ModelAndView modelAndView = new ModelAndView("index");

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double division = num1 / num2;

        switch (caculation) {
            case "+":
                modelAndView.addObject("result", sum);
                break;
            case "-":
                modelAndView.addObject("result", difference);
                break;
            case "*":
                modelAndView.addObject("result", product);
                break;
            case "/":
                modelAndView.addObject("result", division);
                break;
        }
        return modelAndView;
    }


}


