package com.leyla.northwind.business.concretes;

import com.leyla.northwind.business.abstracts.CategoryService;
import com.leyla.northwind.dataAccess.CategoryDao;
import com.leyla.northwind.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    @Override
    public List<Category> getAll() {return categoryDao.findAll();}
}
