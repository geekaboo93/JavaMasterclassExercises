import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(count < 10) {
            System.out.println("Enter number : ");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt) {
                count++;
                sum+=scanner.nextInt();
            } else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Totla sum is " + sum);
        scanner.close();
    }
}
