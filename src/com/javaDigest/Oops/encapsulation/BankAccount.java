package com.javaDigest.Oops.encapsulation;

public class BankAccount {

    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance; // default value of balance means long until we set using deposit method
    }
//    public void setBalance(double balance) {
//        this.balance = balance;                              =========> This is not required. Because we are setting the balance down below. in the deposit method.
//    }


    public void deposit(long amount){
        if( amount > 0){
            balance += amount;
            System.out.println("Deposited!! Total Balance is : "+ balance);
        }else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(long amount){
        if ( amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully Withdrew : "+ amount);
        }else{
            System.out.println("Invalid amount or Insufficient balance");
        }
    }


}
