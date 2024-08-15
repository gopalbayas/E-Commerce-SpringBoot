package com.example.ecommerce_api.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private long id ;
    private String title ;
    private Double price ;
    private String desciption ;
    private Boolean availability ;
    private Long categoryId ;

}
