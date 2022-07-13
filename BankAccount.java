public class BankAccount {
    String owner;
    double balancedollar;

    public BankAccount(String owner, double balancedollar) {
        this.owner = owner;
        this.balancedollar = balancedollar;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance dollar $=" + balancedollar+
                '}';
    }
}
