package com.ameya.demospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
