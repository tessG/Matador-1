import java.util.ArrayList;

public class Player {
    //  Implementer en Player klasse. Lav dens konstruktor sådan at den tager et navn
    //  og en saldo. Ret de to steder i koden hvor Player bliver instansieret.
    private String name;
    private BankAccount bankAccount;
    private int id;
    static int counter = 0;
    private int position;

    private ArrayList<Property> properties;

    public Player(String name, int balance) {
        this.name = name;
        this.id = counter;
        this.bankAccount = new BankAccount(balance);
        counter++;
    }

    @Override
    public String toString() {
        return String.format("Player %d:\n" +
                             "\tName:\t\t%s\n" +
                             "\tBalance:\t%d\n",
                             id, name, bankAccount.getBalance());
    }

    public void updatePosition(int diceRoll)
    {

        this.position += diceRoll;

        if(this.position > 40)
        {
            this.position = this.position - 40; //When player position exceeds 40 we pass start.
        }

    }

    public void doTransaction(int amount)
    {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }

    /* Getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }
}
