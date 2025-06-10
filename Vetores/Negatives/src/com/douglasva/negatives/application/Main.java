package com.douglasva.negatives.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? (Máximo 10): ");
        int n = sc.nextInt();

        while (n > 10 || n < 1) {
            System.out.print("Digite um número até 10: ");
            n = sc.nextInt();
        }

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}