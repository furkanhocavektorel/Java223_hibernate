package org.example.repository;

import org.example.entity.Category;
import org.example.utilty.DBConnection;

public class CategoryRepository {
    DBConnection dbConnection= new DBConnection();

    public void saveCategory(Category category){
        try {
            dbConnection.openSession();
             dbConnection.session.save(category);
            dbConnection.closeSession();
        }catch (Exception e){
            e.printStackTrace();
            dbConnection.rollback();
        }

    }
}
