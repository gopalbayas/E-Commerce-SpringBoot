package com.example.ecommerce_api.Repository;

import com.example.ecommerce_api.model.Category;
import com.example.ecommerce_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
List<Product> findBycategoryId(Long categoryId);
}
