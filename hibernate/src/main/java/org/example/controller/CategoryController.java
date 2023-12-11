package org.example.controller;

import org.example.entity.Category;
import org.example.service.CategoryService;

import java.util.List;

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

    public Category getById(int id){
        Category category=categoryService.getById(id);
        return category;
    }
    public void delete(int id){
        categoryService.delete(id);
    }
  public void update(int id,String name, String serial){
        categoryService.update(id,name,serial);
  }



}
