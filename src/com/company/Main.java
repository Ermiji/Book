package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        String response = "n";


        int choice = 0;

        do {
            System.out.println("Do you want to enter a book information? ");
            response = scan.nextLine();

            if (response.equalsIgnoreCase("y")) {

                Book b = new Book();
                System.out.print("Enter the title: ");
                b.setTitle(scan.nextLine());
                System.out.print("Enter the ISBN: ");
                b.setIsbn(scan.nextLine());


                Author p = new Author();
                System.out.print("Enter the Authors First Name: ");
                p.setfName(scan.nextLine());
                System.out.print("Enter the Authors Last Name: ");
                p.setlName(scan.nextLine());
                System.out.print("Enter the authors Email Address: ");
                p.seteAddress(scan.nextLine());
                System.out.print("Enter the Authors Phone number: ");
                p.setPhoneNumber(scan.nextLine());

                b.setAuthor(p);
                System.out.println(b.getTitle());
                System.out.println(b.getIsbn());
                System.out.println(b.getAuthor().getfName());
                System.out.println(b.getAuthor().getlName());
                System.out.println(b.getAuthor().geteAddress());
                System.out.println(b.getAuthor().getPhoneNumber());

                books.add(b);
            }
        } while (response.equalsIgnoreCase("y"));

        for (Book bk : books) {
//            if () {
                System.out.print(bk.getTitle());
                System.out.print(" ");
                System.out.print((bk.getAuthor()));
            }
        }
    }
//}
