package com.douglasva.book.application;

import com.douglasva.book.entities.Book;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Book's title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Book's author: ");
        String bookAuthor = sc.nextLine();

        System.out.print("Book's price: $ ");
        double bookPrice = sc.nextDouble();

        Book book = new Book(bookTitle, bookAuthor, bookPrice, 0);

        System.out.printf("%nBook:%n" + book);

        System.out.printf("%n%nEnter a value to add in stock: ");
        int addStock = sc.nextInt();
        book.addStock(addStock);
        System.out.printf("Updated data: " + book);

        System.out.printf("%n%nEnter a value to remove from stock: ");
        int removeStock = sc.nextInt();
        book.removeStock(removeStock);
        System.out.printf("%nUpdated data: " + book);

        sc.close();

    }

}