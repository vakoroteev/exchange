import java.lang.*;

public enum CommandMenuEnum {

    CreateAccount("Создание счета");
/*    AccountStatusAll("Проверить состояния счета"),
    AccountStatusRub("Проверить состояние RUB части счета"),
    AccountStatusUsd("проверить состояние USD части счета"),
    AccountStatusEur("проверить состояние EUR части счета"),
    DepositRub("<Сумма> положить на счет рубли"),
    ExchangeRate("Узнать курс валют"),
    PurchaseUsdRub("<Сумма> купить USD за RUB"),
    PurchaseRubUsd("<Сумма> купить RUB за USD"),
    PurchaseEurRub("<Сумма> купить EUR за RUB"),
    PurchaseRubEur("<Сумма> купить RUB за EUR"),
    PurchaseEurUsd("<Сумма> купить EUR за USD"),
    PurchaseUsdEur("<Сумма> купить USD за EUR"),
    Exit("Выйти из программы");*/

    private String value;

    CommandMenuEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static CommandMenuEnum getEnum(String value) {
        if(value == null)
            throw new IllegalArgumentException();
        for(CommandMenuEnum v : values())
            if(value.equalsIgnoreCase(v.getValue())) return v;
        throw new IllegalArgumentException();
    }

}
