import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Help help = new Help();
        AccountManager accountManager = new AccountManager();
        DepositCurrency depositCurrency = new DepositCurrency();
        ExchangeCurrency exchangeCurrency = new ExchangeCurrency();
        Account account = new Account();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Boolean flagExit = true;
        Boolean isAccountCreated = false;
        String allString;
        String[] str;
        double amount;

        help.help();

        while (flagExit) {

            allString = reader.readLine();
            str = allString.split(" ");

            switch (str[0]) {
                case "help":
                    help.help();
                    break;
                case "createAccount":
                    account = new Account();
                    isAccountCreated = true;
                    break;
                case "accountStatusAll" :
                    if (isAccountCreated) {
                        accountManager.getCurrentAccountAllStatus(account);
                    } else {
                        System.out.println("Необходимо создать счет");
                    }
                    break;
                case "accountStatusRub" :
                    if (isAccountCreated) {
                        accountManager.getCurrentAccountRubStatus(account);
                    } else {
                        System.out.println("Необходимо создать счет");
                    }
                    break;
                case "accountStatusUsd" :
                    if (isAccountCreated) {
                        accountManager.getCurrentAccountUsdStatus(account);
                    } else {
                        System.out.println("Необходимо создать счет");
                    }
                    break;
                case "accountStatusEur" :
                    if (isAccountCreated) {
                        accountManager.getCurrentAccountEurStatus(account);
                    } else {
                        System.out.println("Необходимо создать счет");
                    }
                    break;
                case "depositRub" :
                    if (isAccountCreated) {
                        amount = Double.parseDouble(str[1]);
                        depositCurrency.depositRub(account, amount);
                    } else {
                        System.out.println("Необходимо создать счет");
                    }
                    break;
                case "exchangeRate" :
                    exchangeCurrency.getExchangeRate();
                    break;
                case "purchaseCurrency" :
                    if (isAccountCreated) {
                        amount = Double.parseDouble(str[1]);
                        accountManager.purchaseCurrency(account, amount, str[2], str[3]);
                    } else {
                        System.out.println("Необходимо создать счет");
                    }
                    break;
                case "exit":
                    flagExit = false;
                    break;
                default :
                    System.out.println("Данная команда не поддерживается. Для ввывода списка команд введите help");
                    break;

            }
        }
    }
}
