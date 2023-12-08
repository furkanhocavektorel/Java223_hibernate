package org.example.service;

import org.example.entity.Category;
import org.example.repository.CategoryRepositoryI;

public class CategoryService {
    CategoryRepositoryI categoryRepository= new CategoryRepositoryI();

    public void createCategory(String categoryName){
        Category category = new Category();
        category.setName(categoryName);
        categoryRepository.saveCategory(category);
    }

    public boolean deleteCategory(String categoryname){
        Category category= categoryRepository.getByName(categoryname);
        if (category==null){
            System.out.println("bu kategori mevcut degil");
            return false;
        }else {
            categoryRepository.deleteCategory(category);
            return true;
        }
    }
}
