package org.example.service;

import org.example.entity.Category;
import org.example.repository.CategoryRepository;

public class CategoryService {
    CategoryRepository categoryRepository= new CategoryRepository();

    public void createCategory(String categoryName){
        Category category = new Category();
        category.setName(categoryName);
        categoryRepository.saveCategory(category);
    }
}
