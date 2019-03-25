public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);
        return 4.00;
    }
}
