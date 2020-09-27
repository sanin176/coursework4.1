package com.alex.coursework.DAO;

import com.alex.coursework.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product, Integer> {

}
