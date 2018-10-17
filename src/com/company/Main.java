package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Author> authors = new ArrayList<Author>();


        String responseBook = "n";
        String responseAuthor = "n";


        do {
            System.out.println("Do you want to enter a book information? ");
            responseBook = scan.nextLine();
            Book b = new Book();
            Author au= new Author();
            if (responseBook.equalsIgnoreCase("y")) {

                System.out.print("Enter the title: ");
                b.setTitle(scan.nextLine());
                System.out.print("Enter the ISBN: ");
                b.setIsbn(scan.nextLine());
                System.out.print("Enter author first name: ");
                au.setfName(scan.nextLine());
                System.out.print("Enter author last name: ");
                au.setlName(scan.nextLine());

               b.setAuthor(au);
                books.add(b);

             //   System.out.println(b.getTitle());
                //System.out.println(b.getIsbn());
                //System.out.println(b.getAuthor());

            }



        }while (responseBook.equalsIgnoreCase("y"));


            do {
                System.out.println("Do you want to enter an author's information? ");
                responseAuthor = scan.nextLine();
                Author p = new Author();

                if (responseAuthor.equalsIgnoreCase("y")) {

                    System.out.print("Enter the Authors First Name: ");
                    p.setfName(scan.nextLine());
                    System.out.print("Enter the Authors Last Name: ");
                    p.setlName(scan.nextLine());
                    System.out.print("Enter the authors Email Address: ");
                    p.seteAddress(scan.nextLine());
                    System.out.print("Enter the Authors Phone number: ");
                    p.setPhoneNumber(scan.nextLine());


                    authors.add(p);
                }

            } while (responseAuthor.equalsIgnoreCase("y"));




        System.out.println("books.size(): " + books.size());
        for (Book bk : books) {
            System.out.println(bk.getTitle());
            System.out.print("");
            System.out.println(bk.getIsbn());
            System.out.print("");
            System.out.println(bk.getAuthor().getfName());
            System.out.print("");
            System.out.println(bk.getAuthor().getlName());
            System.out.print("");
        }

        //System.out.println("Authors: " + authors.size());

        for(Author auther: authors) {
            System.out.print((auther.toString()));
        }

    }

}



