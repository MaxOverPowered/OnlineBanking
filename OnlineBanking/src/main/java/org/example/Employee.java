package org.example;

import java.util.List;

public class Employee {
    List<Transaction> transactionsList;

    public void addToTransactionList(Transaction transaction){
        transactionsList.add(transaction);
    }

    public List<Transaction> getTransactionList() {
        return transactionsList;
    }
}
