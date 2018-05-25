public class DepositCurrency {
    public void depositRub (Account account, double amount) {
        try {
            account.setRub(amount);
        } catch (NullPointerException e) {
            System.out.println("Необходимо создать счет");
        }
    }
}
