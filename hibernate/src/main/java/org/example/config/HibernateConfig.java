package org.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {


    // sınıfı singleton yaptınız
    //private static HibernateConfig hibernateConfig=null;
    // bununlada session factory
    private static SessionFactory sessionFactory=null;

 /*   public static HibernateConfig getHibernateConfig(){
        if (hibernateConfig==null){
            return new HibernateConfig();
        }else {
            return hibernateConfig;
        }
    }*/

    // hibernate.cfg.xml dosyasını okumaktır tek işlevi.
    // Session Factory ile config işlemlerini ve tablo oluşturma
    // işlemini yapar sonucda bir adet SessionFactory elde edilir.
    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){

        try {
            sessionFactory=new Configuration().configure().buildSessionFactory();
            return sessionFactory;
        }catch (Exception e){
            System.out.println("config de hata oldu");
            e.printStackTrace();
            return sessionFactory;
        }

        }else {
            return sessionFactory;
        }


    }
}
