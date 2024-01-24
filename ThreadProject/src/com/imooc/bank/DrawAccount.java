package com.imooc.bank;

import java.util.Scanner;

public class DrawAccount implements Runnable {
    Bank bank;

    public DrawAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        // Loop for continuous drawings
        do {
            // Ask the user whether to continue drawing or exit
            System.out.println("Draw Money Menu:");
            System.out.println("1. Draw Amount");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");

            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("Enter the amount to draw: ");
                int amount = sc.nextInt();
                
                // Check if the amount exceeds current balance
                if (amount > bank.getBalance()) {
                    System.out.println("Out of money! Exiting Draw Money Menu...");
                    break;
                }

                bank.drawAccount(amount);

                // Display current balance
                System.out.println("Current Balance: " + bank.getBalance());
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (true);

        // Close Scanner
        sc.close();
    }
}
