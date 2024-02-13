package com.leyla.northwind.business.abstracts;

import com.leyla.northwind.core.utilities.results.DataResult;
import com.leyla.northwind.core.utilities.results.Result;
import com.leyla.northwind.core.utilities.results.SuccessDataResult;
import com.leyla.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
    DataResult<Product> findByProductName(String productName);
    DataResult<Product> findByProductNameAndUnitPrice(String productName, int unitPrice);
    DataResult<List<Product>> findByCategoryId(int categoryId);
    DataResult<List<Product>> findByUnitPriceLessThan(int unitPrice);
}
