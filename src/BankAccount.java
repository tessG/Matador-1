public class BankAccount {
    private float balance;

    public BankAccount (float balance) {
        this.balance = balance;
    }

    public float withdrawAmount(float amount) {
        this.balance -= amount;
        return amount;
    }

    public void depositAmount(float amount) {
        this.balance += amount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
