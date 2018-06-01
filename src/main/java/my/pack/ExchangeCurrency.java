package my.pack;

public class ExchangeCurrency {
    private double usdRurRate = 60;
    private double eurRurRate = 70;
    private double eurUsdRate = 0.857;

    public double getEurRurRate() {
        return eurRurRate;
    }

    public void setEurRurRate(double eurRurRate) {
        this.eurRurRate = eurRurRate;
    }

    public double getUsdRurRate() {
        return usdRurRate;
    }

    public void setUsdRurRate(double usdRurRate) {
        this.usdRurRate = usdRurRate;
    }

    public double getEurUsdRate() {
        return eurUsdRate;
    }

    public void setEurUsdRate(double eurUsdRate) {
        this.eurUsdRate = eurUsdRate;
    }

    public void getExchangeRate() {
        System.out.println("Курс валют");
        System.out.println("USD/RUR: " + getUsdRurRate());
        System.out.println("EUR/RUR: " + getEurRurRate());
        System.out.println("EUR/USD: " + getEurUsdRate());
    }
}