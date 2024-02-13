package com.leyla.northwind.business.concretes;

import com.leyla.northwind.business.abstracts.ProductService;
import com.leyla.northwind.core.utilities.results.*;
import com.leyla.northwind.dataAccess.ProductDao;
import com.leyla.northwind.entities.Product;
import jakarta.persistence.OrderBy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductDao productDao;
    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<>("Ugurla listelendi", productDao.findAll());
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ugurla save olundu");
    }
    public DataResult<Product> findByProductName(String productName)
    {
        Product product = this.productDao.findByProductName(productName);
        if(product == null)
        {
            return new ErrorDataResult<>("Bele adda product yoxdur");
        }
        else {
            return new SuccessDataResult<>("Ugurla tapildi", product);
        }

    }
    public DataResult<Product> findByProductNameAndUnitPrice(String productName, int unitPrice)
    {
        Product product = this.productDao.findByProductNameAndUnitPrice(productName, unitPrice);
        if (product==null)
        {
            return new ErrorDataResult<>("Bele xususiyyetlerde product yoxdur");
        }
        else {
            return new SuccessDataResult<>("Ugurla tapildi", product);
        }
    }
    public DataResult<List<Product>> findByCategoryId(int categoryId)
    {
        List<Product> product = this.productDao.findByCategoryId(categoryId);
        if (product == null)
        {
            return new ErrorDataResult<>("Bele product yoxdur");
        }
        else {
            return new SuccessDataResult<>("Ugurla tapildi", product);
        }
    }
    @OrderBy
    public DataResult<List<Product>> findByUnitPriceLessThan(int unitPrice)
    {
        List<Product> product = this.productDao.findByUnitPriceLessThan(unitPrice);
        if (product == null)
        {
            return new ErrorDataResult<>("Bele product yoxdur");
        }
        else{
            return new SuccessDataResult<>("Ugurla tapildi", product);
        }
    }
}
