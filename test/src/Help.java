public class Help {
    private final String[] listCommand = {"createAccount -  создание счёта",
            "accountStatusAll - проверить состояния счета",
            "accountStatusRub - проверить состояние счета",
            "accountStatusUsd - проверить состояние счета",
            "accountStatusEur - проверить состояние счета",
            "depositRub <сумма> - положить на счет рубли",
            "exchangeRate - узнать курс валют",
            "purchaseCurrency <сумма, конвертируемая валюта, конечная валюта> - покупка валюты",
            "exit - выйти из программы"};
    public void help() {
        System.out.println("Список доступных команд:");
        for (int i = 0; i < listCommand.length; i++) {
            System.out.println(listCommand[i]);
        }
    }
}
