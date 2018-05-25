import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Help help = new Help();
        Account account = null;
        AccountManager accountManager = new AccountManager();
        DepositCurrency depositCurrency = new DepositCurrency();
        ExchangeCurrency exchangeCurrency = new ExchangeCurrency();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Boolean flagExit = true;
        String[] inputConsole;

        help.printHelp();

        while (flagExit) {
            try {
                inputConsole = inputReader(reader);
                switch (inputConsole[0]) {
                    case "help":
                        help.printHelp();
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
                        flagExit = false;
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

    }

    private static String[] inputReader(BufferedReader reader) throws IOException {
        String allString;
        String[] str;
        allString = reader.readLine();
        str = allString.split(" ");
        return str;
    }

    private static double amountCurrency (String stringAmountCorrency) {
        return Double.parseDouble(stringAmountCorrency);
    }
}
