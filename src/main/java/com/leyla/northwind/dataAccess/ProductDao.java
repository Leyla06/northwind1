package com.leyla.northwind.dataAccess;

import com.leyla.northwind.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
