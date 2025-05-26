package com.example.lab2.Controller.Bai4;

import com.example.lab2.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/productt")
public class ProductControllerr {

    @GetMapping("/form-bai4")
    public String form(Model model) {
        model.addAttribute("p1", new Product("iPhone 30", 5000.0));
        model.addAttribute("p2", new Product());
        return "Bai4/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("p2") Product p, Model model) {
        model.addAttribute("p1", new Product("iPhone 30", 5000.0));
        model.addAttribute("p2", p);
        return "Bai4/form";
    }

    @ModelAttribute("items")
    public List<Product> getItems() {
        return Arrays.asList(
                new Product("A", 1.0),
                new Product("B", 12.0)
        );
    }
}
