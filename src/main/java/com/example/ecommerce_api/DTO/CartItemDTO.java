package com.example.ecommerce_api.DTO;

import lombok.Data;

@Data
public class CartItemDTO {
    private long id ;
    private Long productId ;
    private Integer quntity ;

}
