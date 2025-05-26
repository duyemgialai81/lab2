package com.example.lab2.Controller.Bai2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/param")
public class ParamController {

   @GetMapping("/form")
    public String form() {
        return "Bai2/form";
    }

    @PostMapping("/save/{x}")
    public String save(@PathVariable("x") String x, @RequestParam("y") String y, Model model) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "Bai2/form";
    }
}

