package com.douglasva.mediapares.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor terá? ");
        int tamanhoVetor = sc.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }

        double nPares = 0;
        double pares = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] %2 == 0) {
                pares += vetor[i];
                nPares++;
            }
        }

        double media = 0;

        if (nPares == 0) {
            System.out.println("Nenhum número par");
        } else {
            media = (double) pares / nPares;
            System.out.printf("Média dos pares: %.1f", media);
        }

        sc.close();

    }

}