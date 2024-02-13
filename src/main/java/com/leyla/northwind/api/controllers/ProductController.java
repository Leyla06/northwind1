package com.leyla.northwind.api.controllers;

import com.leyla.northwind.business.abstracts.ProductService;
import com.leyla.northwind.core.utilities.results.DataResult;
import com.leyla.northwind.core.utilities.results.Result;
import com.leyla.northwind.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll()
    {
        return productService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }
    @GetMapping("/find-by-product-name")
    public DataResult<Product> findByProductName(String productName)
    {
        return this.productService.findByProductName(productName);
    }
    @GetMapping("find-by-product-name-and-unit-price")
    public DataResult<Product> findByProductNameAndUnitPrice(@RequestParam String productName, @RequestParam int unitPrice)
    {
        return this.productService.findByProductNameAndUnitPrice(productName, unitPrice);
    }
    @GetMapping("find-by-category-id")
    public DataResult<List<Product>> findByCategoryId(@RequestParam int categoryId)
    {
        return this.productService.findByCategoryId(categoryId);
    }
    @GetMapping("find-by-unit-price-less-than")
    public DataResult<List<Product>> findByUnitPriceLessThan(int unitPrice)
    {
        return this.productService.findByUnitPriceLessThan(unitPrice);
    }

}
