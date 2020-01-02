import BankAccountChallenge.Account;
import BankAccountChallenge.VipCustomer;

public class Main {
    public static void main(String[] args) {
        /*
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
         **/

        /*
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
         **/

        Account myAccount = new Account();
        myAccount.setAccountNumber("1234456774");
        myAccount.setBalance(8888.88);
        myAccount.setName("KHY");
        myAccount.setEmail("test@whatever.com");
        myAccount.setPhoneNumber("0122353443");
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());
        myAccount.deposit(18.8);
        myAccount.withdraw(88.8);
        System.out.println();

        VipCustomer newVip1 = new VipCustomer();
        System.out.println(newVip1.getName());
        System.out.println(newVip1.getCreditLimit());
        System.out.println(newVip1.getEmail());
        System.out.println();

        VipCustomer newVip2 = new  VipCustomer("John Doe", 5000.0);
        System.out.println(newVip2.getName());
        System.out.println(newVip2.getCreditLimit());
        System.out.println(newVip2.getEmail());
        System.out.println();

        VipCustomer newVip3 = new VipCustomer("David",2000.0,"david@email.com");
        System.out.println(newVip3.getName());
        System.out.println(newVip3.getCreditLimit());
        System.out.println(newVip3.getEmail());
    }
}
