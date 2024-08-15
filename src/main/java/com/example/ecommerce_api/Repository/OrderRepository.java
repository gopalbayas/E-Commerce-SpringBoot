package com.example.ecommerce_api.Repository;

import com.example.ecommerce_api.model.Category;
import com.example.ecommerce_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Category,Long> {
List<Order> findByUserId(Long UserId);
}
