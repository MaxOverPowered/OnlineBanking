package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountBank accountBankALuMisaDinDanemarca = new AccountBank("Euro", AccountType.CORPORATION);
        AccountBank accountBankALuCristi = new AccountBank("Euro", AccountType.CORPORATION);
        accountBankALuMisaDinDanemarca.setBalance(20000);
        accountBankALuCristi.setBalance(200000);
        Client misa = new Client();
        Client cristi = new Client();
        misa.addAccountToList(accountBankALuMisaDinDanemarca);
        cristi.addAccountToList(accountBankALuCristi);
        Bank bank =new Bank();
        List<Client> clients=new ArrayList<Client>();
        clients.add(cristi);
        clients.add(misa);
        bank.setClientList(clients);
        Transaction transaction=new Transaction(accountBankALuMisaDinDanemarca,accountBankALuCristi,500);
        misa.sendMoney(accountBankALuMisaDinDanemarca,accountBankALuCristi,500);
        System.out.println(transaction.getAmount());
        System.out.println(transaction);


    }


}
