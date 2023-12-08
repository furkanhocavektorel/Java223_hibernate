package org.example;

import org.example.controller.CategoryController;
import org.example.entity.Category;
import org.example.repository.CategoryRepositoryI;
import org.example.repository.CustomerRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        CategoryController controller= new CategoryController();
//        controller.createCategory("çay");
//        controller.createCategory("kateori 1");
//        controller.createCategory("kıyafet");
//        controller.createCategory("ayakkabuı");
//        controller.createCategory("peruk");
//
//
//       CategoryRepositoryI categoryRepository= new CategoryRepositoryI();
////       Category category=categoryRepository.getById(5);
////       System.out.println(category);
//
//        List<Category> categories=categoryRepository.getAll();
//        // metot reference
//        categories.forEach(System.out::println);
//


        CategoryRepositoryI categoryRepositoryI= new CategoryRepositoryI();
        Category category= Category.builder().name("su").build();

        categoryRepositoryI.save(category);

        CustomerRepository customerRepository= new CustomerRepository();
        customerRepository.getAll();
        customerRepository.save();














        Category category= new Category();










    }
}