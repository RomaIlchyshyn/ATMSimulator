package models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
        initializeTestAccounts();
    }

    private void initializeTestAccounts() {
        accounts.add(new Account("4512", 1234, 500.0));
        accounts.add(new Account("1111", 1111, 1100.0));
        accounts.add(new Account("9999", 7777, 777.0));
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

