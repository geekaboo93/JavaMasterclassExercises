package OOPMaster;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 15.0, "Honey Wheat");
    }

    @Override
    public void addBurgerAddtion1(String name, double price) {
        System.out.println("Not allowed to add additional item to deluxe burger");
    }

    @Override
    public void addBurgerAddtion2(String name, double price) {
        System.out.println("Not allowed to add additional item to deluxe burger");
    }

    @Override
    public void addBurgerAddtion3(String name, double price) {
        System.out.println("Not allowed to add additional item to deluxe burger");
    }

    @Override
    public void addBurgerAddtion4(String name, double price) {
        System.out.println("Not allowed to add additional item to deluxe burger");
    }
}
