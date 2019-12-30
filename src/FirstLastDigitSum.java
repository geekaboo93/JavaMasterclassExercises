public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(253));
    }

    public static int sumFirstAndLastDigit(int n) {
        if(n < 0) {
            return -1;
        }
        int firstDigit = n;
        while(firstDigit >= 10) {
            firstDigit /= 10;
        }
        int lastDigit =  n % 10;
        return firstDigit + lastDigit;
    }
}
