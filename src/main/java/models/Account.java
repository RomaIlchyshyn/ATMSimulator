package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Account {
    private String accountNumber;
    private int pinCode;
    private double balance;

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public boolean withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

