package com.company;

import java.util.ArrayList;

public class Book extends Author {

    private String title;
    private String isbn;

    private ArrayList<Author> authors;

    public Book() {
        authors = new ArrayList<>();
    }

    public Book(String title, String isbn, ArrayList<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public String getTitle() {

        private Author author;

    public Book() {

        }

    public Book(String title, String isbn, Author author) {
            this.title = title;
            this.isbn = isbn;
            this.author = author;
        }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public String getIsbn () {
            return isbn;
        }

        public void setIsbn (String isbn){

            this.isbn = isbn;
        }

        public ArrayList<Author> getAuthors () {
            return authors;
        }

        public void setAuthors (ArrayList < Author > authors) {
            this.authors = authors;

            this.isbn = isbn;
        }

        public Author getAuthor () {
            return author;
        }

        public void setAuthor (Author author){
            this.author = author;
        }
    }
}
