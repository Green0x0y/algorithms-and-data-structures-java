package org.Tasks.Java.File.Bank;

import java.math.BigDecimal;
import java.util.Date;

public class BankAccount {
    private int accountNumber;
    private BigDecimal balance;
    private String ownerName;
    private double interestRate;
    private Date dateCreated;

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getOwnerName() {
        return ownerName;
    }


    BankAccount(int accountNumber, BigDecimal balance, String ownerName, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.interestRate = interestRate;
        this.dateCreated = new Date(System.currentTimeMillis());
    }
    public void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }
    public boolean withdraw(BigDecimal amount){
        if(balance.compareTo(BigDecimal.ZERO) > 0){
            this.balance = balance.subtract(amount);
            return true;
        }
        else return false;

    }
    public void addInterest(double percent){
        balance = balance.add(BigDecimal.valueOf(percent));
    }
    public String toString(){
        return this.ownerName + " " + this.balance + " " + this.accountNumber;
    }
}


