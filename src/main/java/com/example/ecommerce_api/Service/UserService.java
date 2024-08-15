package com.example.ecommerce_api.Service;

import com.example.ecommerce_api.DTO.UserDTO;

public interface UserService {
    UserDTO registerUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    UserDTO getUserByUsername(String username);
}
