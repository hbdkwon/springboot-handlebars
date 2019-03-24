package com.hbdkwon.handlebars;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HandlebarsController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name", "RayKwon");
        return "hello";
    }

    @GetMapping("hi")
    public String hi(Model model) {
        model.addAttribute("name", "YounghoonKwon");
        return "hi";
    }
}
