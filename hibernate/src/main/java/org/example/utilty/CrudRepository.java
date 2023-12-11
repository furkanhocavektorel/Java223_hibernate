package org.example.utilty;

import org.example.config.HibernateConfig;
import org.example.entity.Category;
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
        try {
            dbConnection.openSession();
            dbConnection.session.delete(t);
            dbConnection.closeSession();
        }catch (Exception e){
            dbConnection.closeSession();
        }

    }

    // update icin önce nesneyi bulmanız.
    // bulunan nesneyi degistirip tekrar gönderiyosunuz.
    public void update(T t) {

        try {
            dbConnection.openSession();
            dbConnection.session.update(t);
            dbConnection.closeSession();

        }catch (Exception e){
            dbConnection.rollback();
        }
    }

    public T getById(ID id) {
        T tt=null;
        try {
            dbConnection.openSession();
            tt= (T) dbConnection.session.find(Object.class,id);
            dbConnection.closeSession();
            return tt;
        }catch (Exception e){
            dbConnection.rollback();
            return tt;
        }
    }


}
