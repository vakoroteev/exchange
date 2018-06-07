package my.pack.Account;

import my.pack.CommandMenu.Permission;
import my.pack.ExchangeCurrency;
import my.pack.Menu;

import java.util.HashMap;

public class AccountManager {

    private ExchangeCurrency exchangeCurrency;
    private double amount;

    public AccountManager(ExchangeCurrency exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public void createAccount(HashMap accountLogin, String login, String role, Permission permission) {

        if (login != null && role != null && (role.equals("admin") || role.equals("client"))) {
            Account account = new Account();
            accountLogin.put(login, account);
            Permission per = permission.getPermission(role);
            account.setRole(per);
            account.setLogin(login);
            System.out.println("Создан аккаунт с ролью " + per.getValue());
        } else if (login == null) {
            System.out.println("Необходимо указать логин");
        } else if (role == null) {
            System.out.println("Необходимо указать роль");
        } else if (role != null) {
            System.out.println("Роль может быть либо client, либо admin");
        } else {
            System.out.println("При создании аккаунта что то пошло не так, проверьте введенные данные");
        }
    }

    public Account logIn(HashMap accountLogin, String login) {
        if (login != null) {
            Account account = (Account) accountLogin.get(login);
            if (account != null) {
                Menu.permission = account.getRole();
                System.out.println("Пользователь с логином " + login + " успешно вошел в систему");
                return account;
            } else {
                System.out.println("Клиента с таким логином нет в системе");
                return null;
            }
        } else {
            System.out.println("Необходимо указать логин");
            return null;
        }
    }

    public Account logOut(Account account) {
        if (account != null) {
            System.out.println("Осуществлен выход из системы");
        } else {
            System.out.println("Вход в систему не осуществлен");
        }
        Menu.permission = Permission.UNAUTHORISED;
        return account = null;
    }

    public void getCurrentAccountCurrencyStatus(Account account, String currency) {
        if (account != null) {
            if (currency.equals("ALL")) {
                System.out.println(account.getRub() + " RUB");
                System.out.println(account.getUsd() + " USD");
                System.out.println(account.getEur() + " EUR");
            } else if (currency.equals("RUB")) {
                System.out.println(account.getRub() + " RUB");
            } else if (currency.equals("EUR")) {
                System.out.println(account.getEur() + " EUR");
            } else if (currency.equals("USD")) {
                System.out.println(account.getUsd() + " USD");
            } else if (currency.equals(null)) {
                System.out.println("Укажите валюту");
            } else {
                System.out.println("Данная валюта не поддерживается");
            }
        } else {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseUsdRub(Account account, double amountRub) {
        try {
            if (account.getRub() >= amountRub) {
                amount = amountRub / exchangeCurrency.getUsdRurRate();
                account.setRub(account.getRub() - amountRub);
                account.setUsd(account.getUsd() + amount);
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseRubUsd(Account account, double amountUsd) {
        try {
            if (account.getUsd() >= amountUsd) {
                amount = amountUsd * exchangeCurrency.getUsdRurRate();
                account.setUsd(account.getUsd() - amountUsd);
                account.setRub(account.getRub() + amount);
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseEurRub(Account account, double amountRub) {
        try {
            if (account.getRub() >= amountRub) {
                amount = amountRub / exchangeCurrency.getEurRurRate();
                account.setRub(account.getRub() - amountRub);
                account.setEur(account.getEur() + amount);
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseRubEur(Account account, double amountEur) {
        try {
            if (account.getEur() >= amountEur) {
                amount = amountEur * exchangeCurrency.getEurRurRate();
                account.setEur(account.getEur() - amountEur);
                account.setRub(account.getRub() + amount);
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseEurUsd(Account account, double amountUsd) {
        try {
            if (account.getUsd() >= amountUsd) {
                amount = amountUsd * exchangeCurrency.getEurRurRate();
                account.setEur(account.getEur() - amountUsd);
                account.setRub(account.getRub() + amount);
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseUsdEur(Account account, double amountEur) {
        try {
            if (account.getEur() >= amountEur) {
                amount = amountEur / exchangeCurrency.getEurUsdRate();
                account.setEur(account.getEur() - amountEur);
                account.setUsd(account.getUsd() + amount);
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }
}
