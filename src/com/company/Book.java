package com.company;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 6d4bed3c9bad54478722a029dd92d1057629a94a
public class Book extends Author {

    private String title;
    private String isbn;
<<<<<<< HEAD
    private ArrayList<Author> authors;

    public Book(){
        authors= new ArrayList<>();
    }

    public Book(String title, String isbn, ArrayList<Author> authors){
        this.title = title;
        this.isbn = isbn;
        this.authors= authors;
    }

    public String getTitle() {

=======
    private Author author;

    public Book(){

    }

    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author= author;
    }

    public String getTitle() {
>>>>>>> 6d4bed3c9bad54478722a029dd92d1057629a94a
        return title;
    }

    public void setTitle(String title) {
<<<<<<< HEAD

=======
>>>>>>> 6d4bed3c9bad54478722a029dd92d1057629a94a
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
<<<<<<< HEAD

        this.isbn = isbn;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
=======
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
>>>>>>> 6d4bed3c9bad54478722a029dd92d1057629a94a
    }
}
