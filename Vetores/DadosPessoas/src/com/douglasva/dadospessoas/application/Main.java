package com.douglasva.dadospessoas.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = sc.nextInt();

        double[] altura = new double[qtdPessoas];
        char[] genero = new char[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        for (int i = 0; i < qtdPessoas; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura: " + menorAltura);

        double maiorAltura = altura[0];
        for (int i = 0; i < qtdPessoas; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.printf("\nMaior altura: " + maiorAltura);

        int contF = 0;
        double somaAltura = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            if (genero[i] == 'F' || genero[i] == 'f') {
                somaAltura += altura[i];
                contF++;
            }
        }

        double mediaAltura = 0;
        if (contF > 0) {
            mediaAltura = somaAltura / contF;
            System.out.printf("\nMédida das alturas das mulheres: %.2f", mediaAltura);
        }

        int contM = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            if (genero[i] == 'M' || genero[i] == 'm') {
                contM++;
            }
        }
        System.out.printf("\nNúmero de homens: " + contM);

        sc.close();

    }

}