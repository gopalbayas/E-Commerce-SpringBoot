package com.example.ecommerce_api.Service;

import com.example.ecommerce_api.DTO.CartDTO;
import com.example.ecommerce_api.DTO.CartItemDTO;

public interface CartService {
    CartDTO getCartByUserId(Long userId);
    CartDTO addProductToCart(Long userId, CartItemDTO cartItemDTO);
    CartDTO updateCartItem(Long userId, CartItemDTO cartItemDTO);
    void removeCartItem(Long userId, Long cartItemId);
}
