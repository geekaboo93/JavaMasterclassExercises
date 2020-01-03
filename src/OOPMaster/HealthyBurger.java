package OOPMaster;

public class HealthyBurger extends Hamburger {
    private String healthyExtraName;
    private double healthyExtraPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Wheat");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }


}
