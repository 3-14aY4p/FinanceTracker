/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects.Transactions;

import Objects.BaseClasses.*;

import java.util.*;

/**
 *
 * @author tianye
 */
public class IncomeTransaction extends Transaction {
    private Account destination;
    
    public IncomeTransaction(int transaction_id, Date date, double amount, String description, Account destination) {
        super(transaction_id, date, amount, description);
        
        this.destination = destination;
    }
    
    @Override
    public void confirmTransaction() {
        destination.deposit(this.amount);
    }
    @Override
    public void undoTransaction() {
        destination.withdraw(this.amount);
    }
    
    @Override
    public ArrayList<Account> getAccount() {
        ArrayList<Account> accs = new ArrayList<>();
        accs.add(destination);
        
        return accs;
    }
}
