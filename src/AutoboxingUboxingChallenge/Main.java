package AutoboxingUboxingChallenge;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Maybank");

        bank.addBranch("Seri Kembangan");

        bank.addCustomer("Seri Kembangan", "John", 30.0);
        bank.addCustomer("Seri Kembangan","David", 100.0);
        bank.addCustomer("Seri Kembangan","Nancy", 33.88);

        bank.addBranch("Bangsar");
        bank.addCustomer("Bangsar","Abu", 50.0);
        bank.addCustomer("Bangsar","Ali", 35.71);

        bank.addCusomterTransaction("Seri Kembangan", "John",222.31);
        bank.addCusomterTransaction("Seri Kembangan", "John",30.50);
        bank.addCusomterTransaction("Seri Kembangan", "Nancy",1200.0);

        bank.listCusomters("Seri Kembangan", true);
        bank.listCusomters("Bangsar",true);

    }
}
