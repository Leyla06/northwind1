package com.leyla.northwind.business.abstracts;

import com.leyla.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
