package my.pack;

import java.math.BigDecimal;

public class ExchangeCurrency {

    private BigDecimal usdRurRate;
    private BigDecimal eurRurRate;
    private BigDecimal eurUsdRate;

    public ExchangeCurrency () {
        usdRurRate = new BigDecimal(60);
        eurRurRate = new BigDecimal(70);
        eurUsdRate = new BigDecimal(0.857);
    }

    public BigDecimal getEurRurRate() {
        return eurRurRate;
    }

    public void setEurRurRate(BigDecimal eurRurRate) {
        this.eurRurRate = eurRurRate;
    }

    public BigDecimal getUsdRurRate() {
        return usdRurRate;
    }

    public void setUsdRurRate(BigDecimal usdRurRate) {
        this.usdRurRate = usdRurRate;
    }

    public BigDecimal getEurUsdRate() {
        return eurUsdRate;
    }

    public void setEurUsdRate(BigDecimal eurUsdRate) {
        this.eurUsdRate = eurUsdRate;
    }

    public void getExchangeRate() {
        System.out.println("Курс валют");
        System.out.println("USD/RUR: " + getUsdRurRate());
        System.out.println("EUR/RUR: " + getEurRurRate());
        System.out.println("EUR/USD: " + getEurUsdRate());
    }
}
