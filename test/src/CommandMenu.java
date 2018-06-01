import java.lang.*;

public enum CommandMenu {

    CreateAccount("Создание счета"),
    AccountStatusCurrency("Проверить состояния <валюта> части счета (ALL для проверки общего счета)"),
    DepositRub("<Сумма> положить на счет рубли"),
    ExchangeRate("Узнать курс валют"),
    PurchaseUsdRub("<Сумма> купить USD за RUB"),
    PurchaseRubUsd("<Сумма> купить RUB за USD"),
    PurchaseEurRub("<Сумма> купить EUR за RUB"),
    PurchaseRubEur("<Сумма> купить RUB за EUR"),
    PurchaseEurUsd("<Сумма> купить EUR за USD"),
    PurchaseUsdEur("<Сумма> купить USD за EUR"),
    Exit("Выйти из программы");

    private String value;

    CommandMenu(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
