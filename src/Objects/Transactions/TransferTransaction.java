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
public class TransferTransaction extends Transaction {
    private Account source;
    private Account destination;
    
    public TransferTransaction(int transaction_id, Date date, double amount, String description, Account source, Account destination) {
        super(transaction_id, date, amount, description);
        
        this.source = source;
        this.destination = destination;
    }
 
    @Override
    public void confirmTransaction() {
        source.withdraw(this.amount);
        destination.deposit(this.amount);
    }
    @Override
    public void undoTransaction() {
        source.deposit(this.amount);
        destination.withdraw(this.amount);
    }
    
    @Override
    public ArrayList<Account> getAccount() {
        ArrayList<Account> accs = new ArrayList<>();
        accs.add(source); accs.add(destination);
        
        return accs;
    }
}
