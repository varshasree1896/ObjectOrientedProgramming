package com.blz.OOPSPrograming;
import java.util.Scanner;
public class Account {

    public static void main(String[] args) {
        AccountTest. debit();

    }
}
class AccountTest {
    static long debitAmount;
    static long accountBalance = 1000l;

    public static void debit() {
        Scanner sc = new Scanner(System. in);
        System. out. println("Enter Debit amount");
        debitAmount = sc. nextLong();
        if (debitAmount > accountBalance) {
            System. out. println("Debit amount exceeded account balance");
            System. out. println("Account balance is = " + accountBalance);
        } else
            System. out. println("Debited amount is " + " " + debitAmount);
        System. out. println("Account balance is " + (accountBalance - debitAmount));
    }
}