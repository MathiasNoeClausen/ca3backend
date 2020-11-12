package dtos;

import entities.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDTO {
    
    private Long id;
    private String title;
    private int year;
    private String author;  

    public BookDTO() {
    }

    public BookDTO(Book book) {
        this.title = book.getTitle();
        this.year = book.getYear();
        this.author = book.getAuthor();
    }
    
    public BookDTO(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
      public List<BookDTO>toDTO(List<Book>books){
        List<BookDTO>dtoes = new ArrayList();
            for(Book b: books){
                dtoes.add(new BookDTO(b));
            }
            return dtoes;
    }
    
    
}
