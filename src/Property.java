public class Property extends Field implements Purchasable {

    int cost, income;

    public Property(int id, String label, int cost, int income) {
        super(id, label);
        this.cost = cost;
        this.income = income;
    }

    @Override
    public void purchase() {

    }

    public void pledge() {
        // pantsæt
    }

    public int getCost() {
        return cost;
    }

    public int getIncome() {
        return income;
    }
}
