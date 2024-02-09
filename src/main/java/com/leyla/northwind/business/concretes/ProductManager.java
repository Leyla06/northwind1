package com.leyla.northwind.business.concretes;

import com.leyla.northwind.business.abstracts.ProductService;
import com.leyla.northwind.dataAccess.ProductDao;
import com.leyla.northwind.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductDao productDao;
    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
