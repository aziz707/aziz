package com.example.aziz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProductsController {
    @GetMapping("bodyblocs/products")
    public String about(Model model) {
        model.addAttribute("title", "Продукты");
        return "bodyblocs/products";
    }
}