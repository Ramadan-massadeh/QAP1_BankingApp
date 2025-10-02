package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(30);
        assertEquals(70, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50);
        account.withdraw(100);
        assertEquals(50, account.getBalance());
    }
}