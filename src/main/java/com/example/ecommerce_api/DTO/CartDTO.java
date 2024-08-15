package com.example.ecommerce_api.DTO;

import lombok.Data;

import java.util.List;

@Data
public class CartDTO {
    private long id ;
    private Long userid ;
    private List<CartItemDTO> items ;

}
