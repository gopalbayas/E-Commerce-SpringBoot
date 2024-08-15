package com.example.ecommerce_api.Controller;

import com.example.ecommerce_api.DTO.CartDTO;
import com.example.ecommerce_api.DTO.CartItemDTO;
import com.example.ecommerce_api.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/{userId}")
    public ResponseEntity<CartDTO> getCartByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }

    @PostMapping("/{userId}/items")
    public ResponseEntity<CartDTO> addProductToCart(@PathVariable Long userId, @RequestBody CartItemDTO cartItemDTO) {
        return ResponseEntity.ok(cartService.addProductToCart(userId, cartItemDTO));
    }

    @PutMapping("/{userId}/items")
    public ResponseEntity<CartDTO> updateCartItem(@PathVariable Long userId, @RequestBody CartItemDTO cartItemDTO) {
        return ResponseEntity.ok(cartService.updateCartItem(userId, cartItemDTO));
    }

    @DeleteMapping("/{userId}/items/{cartItemId}")
    public ResponseEntity<Void> removeCartItem(@PathVariable Long userId, @PathVariable Long cartItemId) {
        cartService.removeCartItem(userId, cartItemId);
        return ResponseEntity.noContent().build();
    }
}
