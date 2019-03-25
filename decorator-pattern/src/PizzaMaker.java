public class PizzaMaker {
    public static void main(String[] args) {
//        Pizza basicPizza = new PlainPizza();
//        Pizza basicPizza = new Mozzarella(new PlainPizza());
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        // this will not work
//        Pizza basicPizza = new TomatoSauce(new Mozzarella());

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

    }
}
