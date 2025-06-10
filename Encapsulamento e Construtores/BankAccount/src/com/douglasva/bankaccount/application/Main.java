package com.douglasva.bankaccount.application;

import com.douglasva.bankaccount.entities.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(number, holder, initialDeposit);
        } else {
            bankAccount = new BankAccount(number, holder);
        }

        System.out.println("\nAccount data:");
        System.out.println(bankAccount);

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        sc.close();
    }
}
