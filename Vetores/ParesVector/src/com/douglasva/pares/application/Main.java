package com.douglasva.pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.printf("\nNúmeros pares:\n");
        for (int i = 0; i < n; i++) {
            if (vect[i] %2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        int par = 0;
        System.out.printf("\n\nQuantidade de pares: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] %2 == 0) {
                par++;
            }
        }

        System.out.print(par);

        sc.close();

    }

}