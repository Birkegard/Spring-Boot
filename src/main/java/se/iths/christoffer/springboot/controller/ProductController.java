package se.iths.christoffer.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.christoffer.springboot.model.Product;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String getProducts(Model model) {
        List<Product> productList = List.of(
                new Product(1, "PS5", 5999, "Electronic"),
                new Product(2, "Gitarr", 25000, "Instrument"),
                new Product(3, "Volvo", 199000, "Car")
        );

        model.addAttribute("product", productList);
        return "product";
    }

}
