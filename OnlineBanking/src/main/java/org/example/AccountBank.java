package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Data
public abstract class AccountBank extends Client{
    private UUID accountId;
    private int balance;
    private String currency;
    private AccountType accountType;
    private List<Transaction> transactionList;

    AccountBank( String currency, AccountType accountType) {
        this.accountId=UUID.randomUUID();
        this.balance = 0;
        this.currency = currency;
        this.accountType = accountType;
        this.transactionList=new ArrayList<Transaction>();
    }

//    public UUID getAccountId() {
//        return accountId;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public String getCurrency() {
//        return currency;
//    }
//
//    public AccountType getAccountType() {
//        return accountType;
//    }
//
//    public List<Transaction> getTransactionList() {
//        return transactionList;
//    }
}
