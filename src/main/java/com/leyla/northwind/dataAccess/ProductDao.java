package com.leyla.northwind.dataAccess;

import com.leyla.northwind.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer>{
    Product findByProductName(String productName);
    Product findByProductNameAndUnitPrice(String productName, int unitPrice);
    List<Product> findByCategoryId(int categoryId);
    List<Product> findByUnitPriceLessThan(int unitPrice);
}
