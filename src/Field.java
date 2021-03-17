public class Field {
    int id;
    String label;

    public Field(int id, String label) {
        this.id = id;
        this.label = label;
        System.out.printf("\n%d: %s", this.id, this.label);
    }
}
