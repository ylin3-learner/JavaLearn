package com.imooc.bank;

import java.util.Scanner;

// Use thread to mimic drawings and savings at the same time
public class SaveAccount implements Runnable {
    Bank bank;

    public SaveAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        // Loop for continuous savings
        do {
            // Ask the user whether to continue saving or exit
            System.out.println("Save Money Menu:");
            System.out.println("1. Save Amount");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");

            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                System.out.println("Enter the amount to save: ");
                int amount = sc.nextInt();
                bank.saveAccount(amount);

                // Display current balance immediately after saving
                System.out.println("Current Balance: " + bank.getBalance());
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (true);

        // Close Scanner
        sc.close();
    }
}
