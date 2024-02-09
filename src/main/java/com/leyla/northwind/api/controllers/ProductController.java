package com.leyla.northwind.api.controllers;

import com.leyla.northwind.business.abstracts.ProductService;
import com.leyla.northwind.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/getAll")
    public List<Product> getAll()
    {
        return productService.getAll();
    }
}
