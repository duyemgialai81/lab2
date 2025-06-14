package com.example.lab2.Controller.Bai5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/api")
public class ResultController {

    @GetMapping("/a")
    public String m1() {
        return "Bai5/a";
    }

    @GetMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        return "Bai5/a";
    }

    @GetMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        return "redirect:/api/a";
    }
    @ResponseBody
    @GetMapping("/d")
    public String m4() {
        return "I come from d";
    }
}