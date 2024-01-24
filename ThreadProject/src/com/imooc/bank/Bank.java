package com.imooc.bank;

import java.util.Scanner;

public class Bank {
    private String account;
    private int balance;
    private Scanner sc;  // Add a new Scanner instance

    public Bank(String account, int balance) {
        this.setAccount(account);
        this.setBalance(balance);
        this.sc = new Scanner(System.in);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank [account=" + account + ", balance=" + getBalance() + "]";
    }

    // Savings
    public synchronized void saveAccount(int savings) {
        // No more Scanner instance
        savings = sc.nextInt();
        // get current savings
        int currentBalance = getBalance();
        // Add money to currentBalance
        currentBalance += savings;
        // Modify money number in account
        setBalance(currentBalance);
        System.out.println("Current Balance: " + getBalance());
    }

    // Drawings
    public synchronized void drawAccount(int drawings) {
    	// No more Scanner instance
        // get current savings
        int currentBalance = getBalance();
        drawings = sc.nextInt();
        // Add money on currentBalance
        currentBalance -= drawings;
        // Modify money number in account
        setBalance(currentBalance);
        System.out.println("Current Balance: " + getBalance());
    }

    // Close Scanner
    public void closeScanner() {
        sc.close();
    }
}
