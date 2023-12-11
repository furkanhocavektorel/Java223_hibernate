package org.example.service;

import org.example.entity.Category;
import org.example.repository.CategoryRepositoryI;

import java.util.List;

public class CategoryService {
    CategoryRepositoryI categoryRepository= new CategoryRepositoryI();

    public void createCategory(String categoryName){
        Category category = new Category();
        category.setName(categoryName);
        //categoryRepository.saveCategory(category);
    }

    // eski delete islemi
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

    public void delete(int id){
        Category category=getById(id);
        if (category==null){
            //throw new RuntimeException("bu id ye sahip kullanici yok");
        }
        categoryRepository.delete(category);
    }


    public Category getById(int id){
        Category category= null;
        category=categoryRepository.getById(id);
        if (category==null){
            //throw new RuntimeException("id bulunamadi");
            System.err.println("id yok");

        }
        return category;
    }


    public void update(int id,String name,String serial){
        Category category=getById(id);
        if (category==null){

        }else {
       // name ve serial benzersiz olabilir.
        // serial alani benzersiz unique
        if (name!=null) {
            //elektornik
            category.setName(name);
        }
        if (serial!=null){
            category.setSerial(serial);
        }
        categoryRepository.update(category);
        }
    }



}
