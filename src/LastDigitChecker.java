public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c))
            return false;

        if((a%10 == b%10) || (b%10 == c%10) || (a%10 == c%10))
            return true;
        return false;
    }

    public static boolean isValid(int n) {
        if(n >= 10 && n <= 1000)
            return true;
        return false;
    }
}
