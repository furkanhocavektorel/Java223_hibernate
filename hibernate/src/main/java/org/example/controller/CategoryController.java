package org.example.controller;

import org.example.service.CategoryService;

public class CategoryController {
    CategoryService categoryService= new CategoryService();

    public void createCategory(String name){
        categoryService.createCategory(name);
    }
}
