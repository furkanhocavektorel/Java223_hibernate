package org.example.utilty;

import org.example.config.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CrudRepository <T,ID> implements ICrudRepository<T,ID> {
    DBConnection dbConnection= new DBConnection();



    public void save(T t) {
        try {
            dbConnection.openSession();
            dbConnection.session.save(t);
            dbConnection.closeSession();
        }catch (Exception e){
            dbConnection.rollback();
        }

    }


    public void delete(T t) {

    }

    public void update(T t) {

    }

    public T getById(ID id) {
        return null;
    }

    public List<T> getAll() {
        return null;
    }

}
