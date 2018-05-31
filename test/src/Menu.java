public class Menu {

    Account account = null;
    AccountManager accountManager = new AccountManager();
    DepositCurrency depositCurrency = new DepositCurrency();
    ExchangeCurrency exchangeCurrency = new ExchangeCurrency();

    public void printHelp() {
        for (CommandMenuEnum i: CommandMenuEnum.values()) {
            System.out.println(i + " - " + i.getValue());
        }
    }

    public void selectionMenuItem (String[] inputConsole) {
        try {
            switch (inputConsole[0]) {
                case "help":
                    printHelp();
                    break;
                case "createAccount":
                    account = new Account();
                    System.out.println("Счет создан");
                    break;
                case "accountStatusCurrency":
                    accountManager.getCurrentAccountCurrencyStatus(account, inputConsole[1]);
                    break;
                case "depositRub":
                    depositCurrency.depositRub(account, amountCurrency(inputConsole[1]));
                    break;
                case "exchangeRate":
                    exchangeCurrency.getExchangeRate();
                    break;
                case "purchaseRubUsd":
                    accountManager.purchaseRubUsd(account, amountCurrency(inputConsole[1]));
                    break;
                case "purchaseUsdRub":
                    accountManager.purchaseUsdRub(account, amountCurrency(inputConsole[1]));
                    break;
                case "purchaseRubEur":
                    accountManager.purchaseRubEur(account, amountCurrency(inputConsole[1]));
                    break;
                case "purchaseEurRub":
                    accountManager.purchaseEurRub(account, amountCurrency(inputConsole[1]));
                    break;
                case "purchaseUsdEur":
                    accountManager.purchaseUsdEur(account, amountCurrency(inputConsole[1]));
                    break;
                case "purchaseEurUsd":
                    accountManager.purchaseEurUsd(account, amountCurrency(inputConsole[1]));
                    break;
                case "exit":
                    Main.flagExit = false;
                    break;
                default:
                    System.out.println("Данная команда не поддерживается. Для ввывода списка команд введите help");
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не указана сумма");
        } catch (NumberFormatException ex) {
            System.out.println("Сумма указана в неверном формате");
        }
    }

    private double amountCurrency (String stringAmountCorrency) {
        return Double.parseDouble(stringAmountCorrency);
    }
}

