package BankAccountChallenge;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // Default constructor
    public VipCustomer() {
        this("Default name", 3000.0,"default@add.com");
    }

    // Save 2 last default

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "default@add.com";
    }

    // Save all
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
