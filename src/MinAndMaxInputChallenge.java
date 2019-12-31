import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        while(true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(!isAnInt) {
                break;
            } else {
                int n = scanner.nextInt();
                if(min == 0 && max == 0) {
                    min = n;
                    max = n;
                } else {
                    if(n < min) {
                        min = n;
                    } else if(n > max) {
                        max = n;
                    }
                }
                scanner.nextLine();
            }
        }
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
        scanner.close();
    }
}
