package OOPMaster;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage", 3.5, "White");
        double price = hamburger.itemizeBurger();
        hamburger.addBurgerAddtion1("Tomato",0.5);
        hamburger.addBurgerAddtion2("Olive",1.0);
        System.out.println("Total Burger price is " + hamburger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.60);
        healthyBurger.addBurgerAddtion1("Egg",1.0);
        healthyBurger.addBurgerAddtion2("Avocado", 2.2);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addBurgerAddtion1("Cheese",2.5);
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeBurger());
    }
}
