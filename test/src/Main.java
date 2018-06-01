import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static Boolean flagExit = true;

    public static void main(String[] args) {

        Menu menu = new Menu(new AccountManager(), new DepositCurrency(), new ExchangeCurrency());
        InputReader inputReader = new InputReader();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        menu.printHelp();
        while (flagExit) {
            menu.selectItemFromMenu(inputReader.inputReader(reader));
        }
    }
}
