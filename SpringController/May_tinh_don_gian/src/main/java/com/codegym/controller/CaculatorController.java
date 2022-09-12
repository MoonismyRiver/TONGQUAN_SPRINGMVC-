package com.codegym.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/caculator")
public class CaculatorController {

    @GetMapping("")
    public String caculator(){
        return ("/index");
    }

    @PostMapping("/cacul")
    public String cacul(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        model.addAttribute()
        return ("/caculator");
        }
    }

