package com.douglasva.somavetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int tamanhoVetor = sc.nextInt();

        int[] vectA = new int[tamanhoVetor];
        int[] vectB = new int[tamanhoVetor];
        int[] vectC = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("%d\n", vectC[i]);
        }

        sc.close();

    }

}