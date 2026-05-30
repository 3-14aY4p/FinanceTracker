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
public class ExpenseTransaction extends Transaction {
    private Account source;
    
    public ExpenseTransaction(int transaction_id, Date date, double amount, String description, Account source) {
        super(transaction_id, date, amount, description);
        
        this.source = source;
    }
    
    @Override
    public void confirmTransaction() {
        source.withdraw(this.amount);
    }
    @Override
    public ArrayList<Account> getAccount() {
        ArrayList<Account> accs = new ArrayList<>();
        accs.add(source);
        
        return accs;
    }
}
