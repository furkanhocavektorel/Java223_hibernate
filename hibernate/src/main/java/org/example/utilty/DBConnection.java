package org.example.utilty;

import org.example.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBConnection {

    public Transaction transaction=null;
    public Session session=null;


    // 3 adet ayrı metot lazım.
    // 1 session acicak
    // 2 session commit edip kapatıcak
    // 3 hata olursa rollback

    public void openSession(){
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
    }
    public void closeSession(){
        transaction.commit();
        session.close();
    }

    public void rollback(){
        transaction.rollback();
        session.close();

    }

    public void ilkMetot(){

        Session session=null;
        Transaction transaction= null;

        try {
            SessionFactory sessionFactory=
                    new Configuration().configure().buildSessionFactory();
            session=sessionFactory.openSession();
            transaction=session.beginTransaction();
            Category category = new Category(1,"elektornilk","dsfgvd");
            session.save(category);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            System.out.println("*************");
            e.printStackTrace();
        }finally {
            session.close();
        }


    }



}
