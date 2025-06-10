package com.douglasva.abaixodamedia.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanhoVetor = sc.nextInt();

        double[] vetor = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            soma += vetor[i];
        }

        double media = 0;
        media = soma / tamanhoVetor;
        System.out.printf("\nMédia do vetor: %.3f", media);

        System.out.printf("\nElementos abaixo da média: \n");
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }

}