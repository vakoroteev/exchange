package my.pack;

import my.pack.Account.Account;

import java.math.BigDecimal;

public class DepositCurrency {
    public void depositRub(Account account, BigDecimal amount) {
        if (account != null) {
            BigDecimal amountOnAccount;
            amountOnAccount = account.getRub();
            account.setRub(amountOnAccount.add(amount));
            System.out.println("Успешное пополнение счета на " + amount + " RUB");
        } else {
            System.out.println("Необходимо создать счет");
        }
    }
}