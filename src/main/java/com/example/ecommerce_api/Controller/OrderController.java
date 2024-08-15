package com.example.ecommerce_api.Controller;

import com.example.ecommerce_api.DTO.OrderDTO;
import com.example.ecommerce_api.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/{userId}")
    public ResponseEntity<OrderDTO> placeOrder(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.placeOrder(userId));
    }

    @GetMapping("/{userId}/history")
    public ResponseEntity<List<OrderDTO>> getOrderHistory(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.getOrderHistory(userId));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDTO> getOrderById(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderService.getOrderById(orderId));
    }
}
