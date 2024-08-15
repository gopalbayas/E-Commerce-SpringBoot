package com.example.ecommerce_api.Repository;

import com.example.ecommerce_api.model.Cart;
import com.example.ecommerce_api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
Optional<Cart> findByUserId(long userId) ;
}
