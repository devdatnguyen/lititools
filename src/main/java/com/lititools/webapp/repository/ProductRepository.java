package com.lititools.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lititools.webapp.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	@Query("SELECT P FROM Products P WHERE P.id=:id")
	List<Product> findProductById(@Param("id") int id);
	
	@Query("SELECT P FROM Products P WHERE P.category.id=:category")
	List<Product> findProductByCategory(@Param("category") String category);
	
}
