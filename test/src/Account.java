public class Account {

    private String firstName;
    private double rub;
    private double usd;
    private double eur;

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }
}
