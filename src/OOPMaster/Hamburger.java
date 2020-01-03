package OOPMaster;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addtional1Name;
    private double additional1Price;

    private String addtional2Name;
    private double additional2Price;

    private String addtional3Name;
    private double additional3Price;

    private String addtional4Name;
    private double additional4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addBurgerAddtion1(String name, double price) {
        this.addtional1Name = name;
        this.additional1Price = price;
    }

    public void addBurgerAddtion2(String name, double price) {
        this.addtional2Name = name;
        this.additional2Price = price;
    }

    public void addBurgerAddtion3(String name, double price) {
        this.addtional3Name = name;
        this.additional3Price = price;
    }

    public void addBurgerAddtion4(String name, double price) {
        this.addtional4Name = name;
        this.additional4Price = price;
    }

    public double itemizeBurger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " +  "on a " + this.breadRollType + " roll with meat " + this.meat + " price is " + this.price);

        if(this.addtional1Name != null) {
            hamburgerPrice += this.additional1Price;
            System.out.println("Added " + this.addtional1Name + " for an extra " + this.additional1Price);
        }

        if(this.addtional2Name != null) {
            hamburgerPrice += this.additional2Price;
            System.out.println("Added " + this.addtional2Name + " for an extra " + this.additional2Price);
        }

        if(this.addtional3Name != null) {
            hamburgerPrice += this.additional3Price;
            System.out.println("Added " + this.addtional3Name + " for an extra " + this.additional3Price);
        }

        if(this.addtional4Name != null) {
            hamburgerPrice += this.additional4Price;
            System.out.println("Added " + this.addtional4Name + " for an extra " + this.additional4Price);
        }

        return hamburgerPrice;
    }
}
