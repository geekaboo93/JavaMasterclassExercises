import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long avg = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                count++;
                sum += scanner.nextInt();
                avg = sum / count;
            } else {
                break;
            }
            scanner.nextLine();
        }
        avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
