/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import com.mysql.cj.xdevapi.SessionFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author User
 */
public class JPAUtil {
    
    private static String PERSISTENCE_UNIT = "PUnit";
    private static EntityManager manager;
    private static EntityManagerFactory factory;
    
    public static EntityManager conectar() {
        if(factory == null || !factory.isOpen()) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        
        if(manager == null || !manager.isOpen()) {
            manager = factory.createEntityManager();
        }
        
        return manager;
    }
    
    public static void desconectar() {
        if(manager.isOpen() && manager != null) {
            manager.close();
            factory.close();
        }
    }
    
//    private static SessionFactory sessionFactory;
//
//    static {
//        try {
//            // Create the SessionFactory from hibernate.cfg.xml
//            sessionFactory = new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            // Log exception (use proper logging in production)
//            System.err.println("Initial SessionFactory creation failed: " + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//    public static void shutdown() {
//        // Close caches and connection pools
//        getSessionFactory().close();
//    }
    
    
    
    
    
    
    
}


