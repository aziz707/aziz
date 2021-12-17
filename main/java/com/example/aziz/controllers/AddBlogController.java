package com.example.aziz.controllers;
import com.example.aziz.models.Post;
import com.example.aziz.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddBlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/bodyblocs/add")
    public String blogAdd(Model model) {
        model.addAttribute("title", "Добавление статьи");
        return "bodyblocs/add";
    }
    @PostMapping("/bodyblocs/add")
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/bodyblocs/home";
    }
}
