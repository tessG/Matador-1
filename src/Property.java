public class Property extends Field {

    int cost, income;

    public Property(int id, String label, int cost, int income) {
        super(id, label);
        this.cost = cost;
        this.income = income;
    }
}
