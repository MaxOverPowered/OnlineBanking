package org.example;

import lombok.ToString;

import java.util.List;

@ToString
public class Transaction {
    AccountBank clientId;
    AccountBank receiverId;
    double amount;
    AccountBank accountBank;
    List<Transaction> transactionList;


    public Transaction(AccountBank clientId, AccountBank receiverId, double amount) {
        this.clientId = clientId;
        this.receiverId = receiverId;
        this.amount = amount;
    }

    public AccountBank getClientId() {
        return clientId;
    }

    public AccountBank getReceiverId() {
        return receiverId;
    }

    public double getAmount() {
        return amount;
    }

    public AccountBank getAccountBank() {
        return accountBank;
    }

}
