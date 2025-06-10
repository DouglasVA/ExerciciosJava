package com.douglasva.aprovados.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[qtdAlunos];
        double[] primeiroSemestre = new double[qtdAlunos];
        double[] segundoSemestre = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            nomes[i] = sc.nextLine();
            primeiroSemestre[i] = sc.nextDouble();
            segundoSemestre[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < qtdAlunos; i++) {
            double media = (primeiroSemestre[i] + segundoSemestre[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();

    }

}