package BankAccountChallenge;

public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    // Default setter
    public Account() {
        this("xxxxxxxxxx",0.00,"BankAccountChallenge.Account holder's name", "BankAccountChallenge.Account holder's email","BankAccountChallenge.Account holder's phone number");
        System.out.println("Empty constructor called");
    }
    public Account(String accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if(withdrawAmount >= this.balance) {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        } else {
            System.out.println("Only this amount " + this.balance + " is available. Withdrawal not proceed");
        }
    }
}
