package com.example.lab2.Controller.Bai1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctrl")
public class OkController {

    @GetMapping("/ok-from")
    public String ok() {
        return "Bai1/ok";
    }

    @PostMapping("/ok")
    public String m1(Model model) {
        model.addAttribute("methodName", "m1()");
        return "Bai1/ok";
    }

    @GetMapping("/ok")
    public String m2(Model model, @RequestParam(required = false) String x) {
        if ("3".equals(x)) {
            model.addAttribute("methodName", "m3()");
            return "Bai1/ok";
        }
        model.addAttribute("methodName", "m2()");
        return "Bai1/ok";
    }
}
