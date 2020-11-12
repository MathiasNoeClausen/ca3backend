/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.BooksDTO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author maddy
 */
public class BookFacade {
    
    private static EntityManagerFactory emf;
    private static BookFacade instance; 
    
    private BookFacade() {
        
    }
    
    
        public static BookFacade getBookFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new BookFacade();
        }
        return instance;
    }
        
        public long getBookCount(){
        EntityManager em = emf.createEntityManager();
        try{
            long bookCount = (long)em.createQuery("SELECT COUNT(b) FROM Book b").getSingleResult();
            return bookCount;
        }finally{  
            em.close();
        }
        
    }
        public BooksDTO getAllBooks() {
        EntityManager em = emf.createEntityManager();
        try {
            return new BooksDTO(em.createNamedQuery("Book.getAll").getResultList());
        } finally {
            em.close();
        }
    
}
}