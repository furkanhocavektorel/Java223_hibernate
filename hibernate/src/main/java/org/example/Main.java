package org.example;

import org.example.controller.CategoryController;
import org.example.entity.Category;
import org.example.entity.Customer;
import org.example.repository.CategoryRepositoryI;
//import org.example.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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


        //CategoryRepositoryI categoryRepositoryI= new CategoryRepositoryI();
        //Category category= Category.builder().name("su").build();


        //categoryRepositoryI.save(category);

        //CustomerRepository customerRepository= new CustomerRepository();
        //customerRepository.getAll();
      //  customerRepository.save();
        CategoryRepositoryI categoryRepositoryI= new CategoryRepositoryI();

       // Category cc=categoryRepositoryI.getById(5);
        System.out.println("************");
        //System.out.println(cc);
        CategoryController controller= new CategoryController();

        //Category category= controller.getById(115);

       // System.out.println(category);
       // controller.delete(7);

       // controller.getAll();

        controller.update(6,"erkek kiyafet","2321csa");
        Set<String> setList= new HashSet<>();
        // Stream api
        List<String> list= new ArrayList<>();
        list.add("asd");
        list.add("xxx");
        list.add("3213");
        list.add("xxx");
        list.add("c32erwd");
        list.add("yyyyyyyy");
        list.add("88888888");
        String y= list.get(0);
        y=list.get(1);

        // lambda = ->
 list.stream().filter(x -> x.contains("a") ).forEach(System.out::println);
        list.forEach(System.out::println);


        List<String > yepisyenilist
                =list.stream().map(y -> tranlate(y)).toList();


      Set<String>  set= list.stream().map(y-> y.toLowerCase()).collect(Collectors.toSet())


















    }




}