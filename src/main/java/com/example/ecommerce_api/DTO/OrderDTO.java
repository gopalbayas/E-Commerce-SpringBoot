package com.example.ecommerce_api.DTO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private long id ;
    private long userId ;
    private Date orderDate ;
    private double totalAmount ;
    private List<OrderItemDTO> Items ;

}
