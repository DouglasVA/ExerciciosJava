package com.douglasva.elementsavarage.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.printf("%nValores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        System.out.printf("%nSoma: %.2f", sum);

        double avg = sum / n;
        System.out.printf("%nMédia: %.2f", avg);

        sc.close();

    }

}