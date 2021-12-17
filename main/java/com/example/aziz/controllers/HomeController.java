package com.example.aziz.controllers;
import com.example.aziz.models.Post;
import com.example.aziz.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;

@Controller
public class HomeController {
    @Autowired
    PostRepository postRepository;

    @GetMapping("/bodyblocs/home{id}")
    public String blogPag(Model model, Pageable pageable) {
        Page<Post> page = (Page<Post>) postRepository.findAll();
        model.addAttribute("page", page.getTotalPages());
        return "bodyblocs/home";
    }

    @GetMapping("/bodyblocs/home")
    public String blogMain(Model model) {

        Iterable<Post> poss = postRepository.findAll();
        ArrayList arrayList = new ArrayList((Collection) poss);
        Collections.reverse(arrayList);
        model.addAttribute("posts", arrayList);
        return "bodyblocs/home";
    }

    @GetMapping("/bodyblocs/home/{id}")
    public String blogID(@PathVariable(value = "id")long id, Model model) {
        Optional<Post> pos = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        pos.ifPresent(res::add);
        model.addAttribute("pos", res);
        return "bodyblocs/blogPos";
    }
}