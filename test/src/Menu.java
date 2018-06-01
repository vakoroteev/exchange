public class Menu {

    Account account = null;
    private final AccountManager accountManager;
    private final DepositCurrency depositCurrency;
    private final ExchangeCurrency exchangeCurrency;

    public Menu(AccountManager accountManager, DepositCurrency depositCurrency, ExchangeCurrency exchangeCurrency) {
        this.accountManager = accountManager;
        this.depositCurrency = depositCurrency;
        this.exchangeCurrency = exchangeCurrency;
    }

    public void printHelp() {
        for (CommandMenu i : CommandMenu.values()) {
            System.out.println(i + " - " + i.getValue());
        }
    }

    public void selectItemFromMenu(String[] inputConsole) {
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

    private double amountCurrency(String stringAmountCorrency) {
        return Double.parseDouble(stringAmountCorrency);
    }
}

