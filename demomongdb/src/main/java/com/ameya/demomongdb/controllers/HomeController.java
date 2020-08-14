package com.ameya.demomongdb.controllers;

import com.ameya.demomongdb.entities.Item;
import com.ameya.demomongdb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @RequestMapping("/addItem")
    public ModelAndView addItem(Model model) {
        itemRepository.save(new Item("HardDisk","Sandisk",99));
        List<Item> item = itemRepository.findByItemName("HardDisk");
        model.addAttribute("items", item.toString());
        model.addAttribute("itemName","HardDisk");
        return new ModelAndView("home");
    }
}
