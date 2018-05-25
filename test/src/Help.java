public class Help {
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
}
