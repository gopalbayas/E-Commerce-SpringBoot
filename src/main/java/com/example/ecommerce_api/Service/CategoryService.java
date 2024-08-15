package com.example.ecommerce_api.Service;

import com.example.ecommerce_api.DTO.CategoryDTO;
import com.example.ecommerce_api.model.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryById(Long id);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    void deleteCategory(Long id);
}
