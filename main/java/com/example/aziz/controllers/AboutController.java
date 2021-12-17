package com.example.aziz.controllers;

import com.example.aziz.models.Post;
import com.example.aziz.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AboutController {
    @GetMapping("bodyblocs/about")
    public String about(Model model) {
        model.addAttribute("title", "О нас");
        return "bodyblocs/about";
    }
}
