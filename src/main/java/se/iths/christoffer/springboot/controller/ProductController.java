package se.iths.christoffer.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.christoffer.springboot.model.Product;
import se.iths.christoffer.springboot.service.ProductService;

import java.util.List;


@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    public String getProducts(Model model) {
        List<Product> productList = productService.getProducts();
        model.addAttribute("product", productList);
        return "product";
    }

}
