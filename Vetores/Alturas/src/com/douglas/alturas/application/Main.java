package com.douglas.alturas.application;

import com.douglas.alturas.entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int pessoas = sc.nextInt();
        System.out.println();

        Pessoa[] pessoa = new Pessoa[pessoas];

        for (int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0;
        for (int i = 0; i < pessoa.length; i++) {
            somaAltura += pessoa[i].getAltura();
        }

        double mediaAltura = somaAltura / pessoa.length;
        System.out.printf("%nMédia de altura: %.2f", mediaAltura);

        int menorDe16 = 0;

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                menorDe16++;
            }
        }

        double porcentagemMenores = ((double) menorDe16 / pessoa.length) * 100.0;

        System.out.printf("%nPessoas com menos de 16 anos: %.1f%%%n", porcentagemMenores);

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getName());
            }
        }

        sc.close();
    }

}