package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void testName() {
        BankAccount newBankAccount = new BankAccount("Cameron", 5000, 1);
        newBankAccount.setName("Steve");
        assertEquals("Steve", newBankAccount.GetName());
    }
    void testDeposit() {
        BankAccount newBankAccount = new BankAccount("Cameron", 5000, 1);
        newBankAccount.deposit(500);
        assertEquals(5500, newBankAccount.printBalance());
    }
    void testString() {
        BankAccount newBankAccount = new BankAccount("Cameron", 5000, 1);
        assertEquals("(Account Number: 1)Cameron's account has a balance of $5000", newBankAccount.toString());
    }
    void testTransfer() {
        BankAccount newBankAccount = new BankAccount("Cameron", 5000, 1);
        BankAccount newBankAccount1 = new BankAccount("Fang", 500000, 2);
        newBankAccount1.transfer(newBankAccount, 200000);
        assertEquals(205000, newBankAccount.printBalance());
    }
}
