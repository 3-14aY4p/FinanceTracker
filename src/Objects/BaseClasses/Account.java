/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects.BaseClasses;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author tianye
 */
public class Account implements Serializable {
    private String accountName;
    private double balance;
    
    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount; 
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
