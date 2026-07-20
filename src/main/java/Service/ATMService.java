package Service;

import models.Account;

public class ATMService {
    private Account currentAccount;

    public boolean login(Account account, int pin) {
        if(account != null && account.getPinCode() == pin) {
            this.currentAccount = account;
            return true;
        }
        return false;
    }
    public void logout() {
        this.currentAccount = null;
    }
    public double getUserBalance() {
        return currentAccount.getBalance();
    }
    public boolean depositMoney(double amount) {
        if(amount > 0) {
            currentAccount.depositMoney(amount);
            return true;
        }
        return false;
    }
    public boolean withdrawMoney(double amount) {
        return currentAccount.withdrawMoney(amount);
    }
}
