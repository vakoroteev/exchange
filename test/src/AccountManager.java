public class AccountManager {
    private ExchangeCurrency exchangeCurrency;
    private double amount;

    public void getCurrentAccountAllStatus (Account account) {
        try {
            System.out.println(account.getRub() + " RUB");
            System.out.println(account.getUsd() + " USD");
            System.out.println(account.getEur() + " EUR");
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void getCurrentAccountRubStatus (Account account) {
        try {
            System.out.println(account.getRub() + " RUB");
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void getCurrentAccountUsdStatus (Account account) {
        try {
            System.out.println(account.getUsd() + " USD");
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void getCurrentAccountEurStatus (Account account) {
        try {
            System.out.println(account.getEur() + " EUR");
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }

    public void purchaseUsdRub (Account account, double amountRub) {
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

    public void purchaseRubUsd (Account account, double amountUsd) {
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

    public void purchaseEurRub (Account account, double amountRub) {
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

    public void purchaseRubEur (Account account, double amountEur) {
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

    public void purchaseEurUsd (Account account, double amountUsd) {
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

    public void purchaseUsdEur (Account account, double amountEur) {
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
