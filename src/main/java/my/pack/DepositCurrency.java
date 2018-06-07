package my.pack;

import my.pack.Account.Account;

public class DepositCurrency {
    public void depositRub (Account account, double amount) {
        if (account != null) {
            account.setRub(amount);
            System.out.println("Успешное пополнение счета на " + amount + " RUB");
        } else {
            System.out.println("Необходимо создать счет");
        }
    }
}