package my.pack.CommandMenu;

public enum CommandMenu {

    HELP("help - Вызвать список доступных команд"),
    LOGIN("login <логин> - Вход в систему под пользователем с логином <логин>"),
    LOGOUT("logout - Выйти из системы"),
    CREATE_ACCOUNT("createAccount <логин> <роль> - Создание счета для нового пользователя <логин> с правами <ролью>"),
    ACCOUNT_STATUS_CURRENCY("accountStatusCurrency <валюта> - Проверить состояния <валюта> части счета (ALL для проверки общего счета)"),
    DEPOSIT_RUB("depositRub <сумма> - <Сумма> положить на счет рубли"),
    EXCHANGE_RATE("exchangeRate - Узнать курс валют"),
    PURCHASE_USD_RUB("purchaseUsdRub <сумма> - <Сумма> купить USD за RUB"),
    PURCHASE_RUB_USD("purchaseRubUsd <сумма> - <Сумма> купить RUB за USD"),
    PURCHASE_EUR_RUB("purchaseEurRub <сумма> - <Сумма> купить EUR за RUB"),
    PURCHASE_RUB_EUR("purchaseRubEur <сумма> - <Сумма> купить RUB за EUR"),
    PURCHASE_EUR_USD("purchaseEurUsd <сумма> - <Сумма> купить EUR за USD"),
    PURCHASE_USD_EUR("purchaseUsdEur <сумма> - <Сумма> купить USD за EUR"),
    EXIT("exit - Выйти из программы"),
    DEFAULT("Данная команда не поддерживается");

    private String value;

    CommandMenu(String value) {
        this.value = value;
    }

    // Если добавить название команды к enum'у, то такого большого switch'a удастся сбежать, сделав один метод findCommandByName
    public static CommandMenu getMenu(String command) {
        switch (command) {
            case "help":
                return CommandMenu.HELP;
            case "login":
                return CommandMenu.LOGIN;
            case "logout":
                return CommandMenu.LOGOUT;
            case "createAccount":
                return CommandMenu.CREATE_ACCOUNT;
            case "depositRub":
                return CommandMenu.DEPOSIT_RUB;
            case "accountStatusCurrency":
                return CommandMenu.ACCOUNT_STATUS_CURRENCY;
            case "exchangeRate":
                return CommandMenu.EXCHANGE_RATE;
            case "purchaseUsdRub":
                return CommandMenu.PURCHASE_USD_RUB;
            case "purchaseRubUsd":
                return CommandMenu.PURCHASE_RUB_USD;
            case "purchaseEurRub":
                return CommandMenu.PURCHASE_EUR_RUB;
            case "purchaseRubEur":
                return CommandMenu.PURCHASE_RUB_EUR;
            case "purchaseEurUsd":
                return CommandMenu.PURCHASE_EUR_USD;
            case "purchaseUsdEur":
                return CommandMenu.PURCHASE_USD_EUR;
            case "exit":
                return CommandMenu.EXIT;
            default:
                return CommandMenu.DEFAULT;
        }
    }

    public String getValue() {
        return value;
    }

}

