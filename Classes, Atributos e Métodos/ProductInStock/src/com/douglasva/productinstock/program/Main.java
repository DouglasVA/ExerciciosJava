package com.douglasva.productinstock.program;

import com.douglasva.productinstock.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.printf("Enter product data: %n"+ "Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("%nProduct data: " + product);
        System.out.printf("%n%nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.printf("%nUpdated data: " + product);
        System.out.printf("%n%nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.printf("%nUpdated data: " + product);

        sc.close();

    }

}
