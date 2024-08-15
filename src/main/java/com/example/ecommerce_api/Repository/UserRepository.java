package com.example.ecommerce_api.Repository;

import com.example.ecommerce_api.model.Category;
import com.example.ecommerce_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
Optional<User> findByUsername(String username);
}
