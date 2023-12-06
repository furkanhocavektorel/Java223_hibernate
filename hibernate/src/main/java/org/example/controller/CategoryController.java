package org.example.controller;

import org.example.service.CategoryService;

public class CategoryController {
    CategoryService categoryService= new CategoryService();

    public void createCategory(String name){
        categoryService.createCategory(name);
    }

    public String deleteCategory(String categoryName){
        boolean bl=categoryService.deleteCategory(categoryName);
        if (!bl){
            return "category silinmedi";
        }else {
            return "category silindi";
        }
    }



}
