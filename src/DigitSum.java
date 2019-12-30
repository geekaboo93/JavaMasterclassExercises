public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(-4590));
        System.out.println(sumDigits(256));
        System.out.println(sumDigits(454623));
    }

    private static int sumDigits(int num) {
        if(num < 10) {
            return -1;
        }
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum+=digit;

            num /= 10;
        }
        return sum;
    }
}
