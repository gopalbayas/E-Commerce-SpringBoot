package com.example.ecommerce_api.Service;

import com.example.ecommerce_api.DTO.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO placeOrder(Long userId);
    List<OrderDTO> getOrderHistory(Long userId);
    OrderDTO getOrderById(Long orderId);
}
