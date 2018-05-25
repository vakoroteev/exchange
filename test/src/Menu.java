import java.io.BufferedReader;
import java.io.IOException;

public class Menu {

    Account account = null;
    AccountManager accountManager = new AccountManager();
    DepositCurrency depositCurrency = new DepositCurrency();
    ExchangeCurrency exchangeCurrency = new ExchangeCurrency();
    String[] inputConsole;

    private final String[] listCommand = {"createAccount -  создание счёта",
            "accountStatusAll - проверить состояния счета",
            "accountStatusRub - проверить состояние RUB части счета",
            "accountStatusUsd - проверить состояние USD части счета",
            "accountStatusEur - проверить состояние EUR части счета",
            "depositRub <сумма> - положить на счет рубли",
            "exchangeRate - узнать курс валют",
            "purchaseUsdRub <сумма> - покупка USD за RUB",
            "purchaseRubUsd <сумма> - покупка RUB за USD",
            "purchaseEurRub <сумма> - покупка EUR за RUB",
            "purchaseRubEur <сумма> - покупка RUB за EUR",
            "purchaseEurUsd <сумма> - покупка EUR за USD",
            "purchaseUsdEur <сумма> - покупка USD за EUR",
            "exit - выйти из программы"};

    public void printHelp() {
        System.out.println("Список доступных команд:");
        for (int i = 0; i < listCommand.length; i++) {
            System.out.println(listCommand[i]);
        }
    }

    public void selectionMenuItem (BufferedReader reader) {
        try {
            inputConsole = inputReader(reader);
            switch (inputConsole[0]) {
                case "help":
                    printHelp();
                    break;
                case "createAccount":
                    account = new Account();
                    break;
                case "accountStatusAll":
                    accountManager.getCurrentAccountAllStatus(account);
                    break;
                case "accountStatusRub":
                    accountManager.getCurrentAccountRubStatus(account);
                    break;
                case "accountStatusUsd":
                    accountManager.getCurrentAccountUsdStatus(account);
                    break;
                case "accountStatusEur":
                    accountManager.getCurrentAccountEurStatus(account);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] inputReader(BufferedReader reader) throws IOException {
        String allString;
        String[] str;
        allString = reader.readLine();
        str = allString.split(" ");
        return str;
    }

    private double amountCurrency (String stringAmountCorrency) {
        return Double.parseDouble(stringAmountCorrency);
    }
}

