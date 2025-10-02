package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(50);
        System.out.println("After deposit: " + account.getBalance());

        account.withdraw(30);
        System.out.println("After withdraw: " + account.getBalance());
    }
}