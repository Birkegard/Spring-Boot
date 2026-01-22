package se.iths.christoffer.springboot.service;

import org.springframework.stereotype.Service;
import se.iths.christoffer.springboot.model.Product;

import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        List<Product> productList = List.of(
                new Product(1, "PS5", 5999, "Electronic"),
                new Product(2, "Gitarr", 25000, "Instrument"),
                new Product(3, "Volvo", 199000, "Car")
        );
        return productList;
    }

}
