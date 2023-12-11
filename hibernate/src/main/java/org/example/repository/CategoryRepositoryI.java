package org.example.repository;

import org.example.entity.Category;
import org.example.utilty.CrudRepository;
import org.example.utilty.ICrudRepository;
import org.example.utilty.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryI extends CrudRepository<Category,Integer> {
    DBConnection dbConnection = new DBConnection();

    // CRUD= CREATE, UPDATE, DELETE, READ

    public void deleteCategory(Category category) {
        try {
            dbConnection.openSession();
            dbConnection.session.delete(category);
            dbConnection.closeSession();
        } catch (Exception e) {
            e.printStackTrace();
            dbConnection.rollback();
        }
    }

    // eski
    public Category getById(int id){

        try {

            dbConnection.openSession();
            Category category=dbConnection.session.find(Category.class,id);
            dbConnection.closeSession();
            return category;

        } catch (Exception e){
            e.printStackTrace();
            dbConnection.rollback();
            return null;
        }


    }

    // eski getall
//    public List<Category> getAll(){
//        // bos liste
//
//        List<Category> categories= new ArrayList<>();
//        try {
//            dbConnection.openSession();
//            // listenin icini db verileri ile doldurdum.
//            categories=
//                    dbConnection.session.createNativeQuery("select * from category", Category.class).getResultList();
//            dbConnection.closeSession();
//            return categories;
//        }catch (Exception e){
//            dbConnection.rollback();
//            return categories;
//
//        }
//
//    }



    // Ortak Crud islemleri icin sınıf degiskeni ile(T)
    // baseRepo olusturun.

    public Category getByName(String categoryname) {
        String sql = "select * from category where name = '" + categoryname + "'";
        Category category=null;
        try {
            dbConnection.openSession();
            category =
                    dbConnection.session.createNativeQuery(sql, Category.class).getSingleResult();

            if (category == null) {
                dbConnection.closeSession();
                return category;
            } else {
                dbConnection.closeSession();
                return category;
            }

        }catch (Exception e){
            e.printStackTrace();
            dbConnection.rollback();
            return category;
        }


    }





}