/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entities.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author maddy
 */
public class SetupBooks {

    
    
    public static void main(String[] args) {
    EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
    EntityManager em = emf.createEntityManager();
    
    
    Book book = new Book("Harry Potter", 1997, "J.K Rowling");
    Book book1 = new Book("Alice i eventyrland", 1865, "Lewis Carroll");
    Book book2 = new Book("Lord of the Rings", 1954, "J.R.R Tolkien");
    
    em.getTransaction().begin();
    em.persist(book);
    em.persist(book1);
    em.persist(book2);
    em.getTransaction().commit();
    
    
    }  
}
