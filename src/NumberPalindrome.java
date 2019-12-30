public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(62345678));
        System.out.println(isPalindrome(202));
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int n) {
        int val = n;
        int reverse = 0;
        while (val != 0) {
            int digit = val % 10;
            reverse = reverse * 10 + digit;
            val = val / 10;
        }

        if(n == reverse) {
            return true;
        }

        return false;
    }
}
