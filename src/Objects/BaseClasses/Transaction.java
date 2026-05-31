/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects.BaseClasses;

import java.io.*;
import java.util.*;

/**
 *
 * @author tianye
 */

// [x] Inheritance here!! 
public class Transaction implements Serializable {
    // [x] DATA ENCAPSULATION - Done yippee
    protected int transaction_id;
    protected Date date;
    protected double amount;
    protected String description;
    
    public Transaction(int transaction_id, Date date, double amount, String description) {
        this.transaction_id = transaction_id;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    // [x] Polymorphism here!! @Override or Overload this later!
    public void confirmTransaction() {      
        /*
        
        Writing my notes and thoughts here, cz why not.
        Ok, so, anyway! Here is what I'm thinking!!
        For this function, we just return:
        
            - Income    -> positive (+) towards the destination
            - Expense   -> negative (-) towards the source
            - Transfer  -> (+) towards the destination and
                           negative (-) towards the source

        */
    }
    public void undoTransaction() {
        
    }
    public ArrayList<Account> getAccount() {
        return null;
    }
    
    
    // getter functions
    public int getTransactionID() {
        return transaction_id;
    }
    public Date getDate() {
        return date;
    }
    public double getAmount() {
        return amount;
    }
    public String getDescription() {
        return description;
    }
    
    // setter functions
    public void setTransactionID(int transaction_id) {
        this.transaction_id = transaction_id;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
