package com.ameya.freemarkerdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomePageController {

    @RequestMapping("/welcome")
    public ModelAndView welcome(@RequestParam(name="firstName", required = false) String firstName,
                                @RequestParam(name="lastName", required = false) String lastName,
                                Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return new ModelAndView("welcome");
    }

}
