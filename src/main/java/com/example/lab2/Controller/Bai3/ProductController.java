package com.example.lab2.Controller.Bai3;

import com.example.lab2.Controller.Bai3.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/formm")
    public String form(Model model,Product product) {
        model.addAttribute("product", product);
        return "Bai3/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product", product);
        return "Bai3/form";
    }
}
