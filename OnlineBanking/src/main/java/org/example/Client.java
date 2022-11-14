package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Client {
    private UUID idClient;
    private List<AccountBank> accountBankList;

    public Client() {
        this.idClient = UUID.fromString(UUID.randomUUID().toString());
        this.accountBankList = new ArrayList<AccountBank>();
    }

    public void addAccountToList(AccountBank accountBank) {
        accountBankList.add(accountBank);
    }

//    public UUID getIdClient() {
//        return idClient;
//    }
//
//    public List<AccountBank> getAccountBankList() {
//        return accountBankList;
//    }

    public Transaction sendMoney(AccountBank currentAccount, AccountBank receiver, double amount) {
        if (currentAccount.getAccountId() != receiver.getAccountId() && (currentAccount.getCurrency() == null ? receiver.getCurrency() == null : currentAccount.getCurrency().equals(receiver.getCurrency()))) {
            if (currentAccount.getBalance() >= amount) {
                if (currentAccount.getAccountType().equals(AccountType.CONSUMER)) {
                    amount += (amount * 0.01);
                    System.out.println("Transaction ok");
                }
                System.out.println("Transaction ok");
                return new Transaction(currentAccount, receiver, amount);
            }
        }
        System.out.println("Transaction with problem");
        return null;
    }


}

