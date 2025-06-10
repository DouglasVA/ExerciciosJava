package com.douglasva.maisvelho.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int qtdPessoas = sc.nextInt();

        String[] nome = new String[qtdPessoas];
        int[] idade = new int[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maisVelha = idade[0];
        int posicao = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            if (idade[i] > maisVelha) {
                maisVelha = idade[i];
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s", nome[posicao]);

        sc.close();

    }

}