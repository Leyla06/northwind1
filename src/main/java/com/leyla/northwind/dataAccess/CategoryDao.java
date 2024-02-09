package com.leyla.northwind.dataAccess;

import com.leyla.northwind.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
