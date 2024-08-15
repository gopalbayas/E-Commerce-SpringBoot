package com.example.ecommerce_api.Service;

import com.example.ecommerce_api.DTO.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProductsByCategory(Long categoryId);
    ProductDTO getProductById(Long id);
    ProductDTO createProduct(ProductDTO productDTO);
    void deleteProduct(Long id);
}
