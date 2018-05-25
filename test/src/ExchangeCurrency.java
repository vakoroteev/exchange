public class ExchangeCurrency {
    private double rurUsdRate = 60;
    private double rurEurRate = 70;
    private double usdEurRate = 0.857;

    double getRurEurRate() {
        return rurEurRate;
    }

    public void setRurEurRate(double rurEurRate) {
        this.rurEurRate = rurEurRate;
    }

    double getRurUsdRate() {
        return rurUsdRate;
    }

    void setRurUsdRate(double rurUsdRate) {
        this.rurUsdRate = rurUsdRate;
    }

    public double getUsdEurRate() {
        return usdEurRate;
    }

    void setUsdEurRate(double usdEurRate) {
        this.usdEurRate = usdEurRate;
    }

    public void getExchangeRate() {
        System.out.println("Курс валют");
        System.out.println("RUR/USD: " + getRurUsdRate());
        System.out.println("RUR/EUR: " + getRurEurRate());
        System.out.println("USD/EUR: " + getUsdEurRate());
    }
}
