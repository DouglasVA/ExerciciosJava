package com.douglasva.notaaluno.program;

import com.douglasva.notaaluno.entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome do aluno: ");
        student.name = sc.nextLine();

        System.out.print("Nota do primeiro semestre: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Nota do segunda semestre: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Nota do terceiro semestre: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("%nFinal grade: %.2f ", student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.printf("%nFAILED");
            System.out.printf("%nMissing poits: %.2f", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();

    }

}