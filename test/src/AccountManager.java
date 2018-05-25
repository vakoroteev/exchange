public class AccountManager {
    private ExchangeCurrency exchangeCurrency = new ExchangeCurrency();
    private double amount;

    public void getCurrentAccountAllStatus (Account account) {
        System.out.println(account.getRub() + " RUB");
        System.out.println(account.getUsd() + " USD");
        System.out.println(account.getEur() + " EUR");
    }

    public void getCurrentAccountRubStatus (Account account) {
        System.out.println(account.getRub() + " RUB");
    }
    public void getCurrentAccountUsdStatus (Account account) {
        System.out.println(account.getUsd() + " USD");
    }
    public void getCurrentAccountEurStatus (Account account) {
        System.out.println(account.getEur() + " EUR");
    }
    public void purchaseCurrency (Account account, double firstAmount, String firstCurrency, String secondaryCurrency) {

        if (firstCurrency.equals("RUB")) {
            if (account.getRub() >= firstAmount) {
                if (secondaryCurrency.equals("USD")) {
                    amount = firstAmount / exchangeCurrency.getRurUsdRate();
                    account.setRub(account.getRub() - firstAmount);
                    account.setUsd(account.getUsd() + amount);
                } else if (secondaryCurrency.equals("EUR")) {
                    amount = firstAmount / exchangeCurrency.getRurEurRate();
                    account.setRub(account.getRub() - firstAmount);
                    account.setEur(account.getEur() + amount);
                } else {
                    System.out.println("Выбранный обмен недоступен");
                }
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } else if (firstCurrency.equals("USD")) {
            if (account.getUsd() >= firstAmount) {
                if (secondaryCurrency.equals("RUB")) {
                    amount = firstAmount * exchangeCurrency.getRurUsdRate();
                    account.setUsd(account.getUsd() - firstAmount);
                    account.setRub(account.getRub() + amount);
                } else if (secondaryCurrency.equals("EUR")) {
                    amount = firstAmount * exchangeCurrency.getRurEurRate();
                    account.setEur(account.getEur() - firstAmount);
                    account.setRub(account.getRub() + amount);
                } else {
                    System.out.println("Выбранный обмен недоступен");
                }
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } else if (firstCurrency.equals("EUR")) {
            if (account.getEur() >= firstAmount) {
                if (secondaryCurrency.equals("RUB")) {
                    amount = firstAmount * exchangeCurrency.getRurEurRate();
                    account.setEur(account.getEur() - firstAmount);
                    account.setRub(account.getRub() + amount);
                } else if (secondaryCurrency.equals("USD")) {
                    amount = firstAmount / exchangeCurrency.getUsdEurRate();
                    account.setEur(account.getEur() - firstAmount);
                    account.setUsd(account.getUsd() + amount);
                } else {
                    System.out.println("Выбранный обмен недоступен");
                }
            } else {
                System.out.println("Недостаточно средств на счету");
            }
        } else {
            System.out.println("Данная валюта не поддерживается");
        }

    }
}
