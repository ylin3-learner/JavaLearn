package com.imooc.bank;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Create account, assign account info and initial savings
        Bank bank = new Bank("s001", 1000);

        // Create thread instances
        SaveAccount saveThread = new SaveAccount(bank);
        DrawAccount drawThread = new DrawAccount(bank);

        // Create Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Main Loop
        int mainChoice;
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Save Money");
            System.out.println("2. Draw Money");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    saveMoneyMenu(bank, sc);
                    break;
                case 2:
                    drawMoneyMenu(bank, sc);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (mainChoice != 0);
        
        // Start threads after user input
        Thread saveThreadInstance = new Thread(saveThread);
        Thread drawThreadInstance = new Thread(drawThread);
        saveThreadInstance.start();
        drawThreadInstance.start();
        
        try {
            // join save & draw threads to print out current savings
            saveThreadInstance.join();
            drawThreadInstance.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close Scanner
        sc.close();
        // Close the scanner in the Bank class
        bank.closeScanner();
    }

    // Sub-menu for saving money
    private static void saveMoneyMenu(Bank bank, Scanner sc) {
        int amount;
        do {
            System.out.println("Save Money Menu:");
            System.out.println("1. Save Amount");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to save: ");
                    amount = sc.nextInt();
                    bank.saveAccount(amount);
                    break;
                case 0:
                    System.out.println("Exiting Save Money Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }

    // Sub-menu for drawing money
    private static void drawMoneyMenu(Bank bank, Scanner sc) {
        int amount;
        do {
            System.out.println("Draw Money Menu:");
            System.out.println("1. Draw Amount");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to draw: ");
                    amount = sc.nextInt();
                    bank.drawAccount(amount);
                    break;
                case 0:
                    System.out.println("Exiting Draw Money Menu...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }
}
