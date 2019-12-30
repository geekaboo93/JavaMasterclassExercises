public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,23));


    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        while(a > 0) {
            int tmpB = b;
            int tmpA = a % 10;
            while(tmpB > 0) {
                if(tmpA == tmpB % 10) {
                    return true;
                }
                tmpB /= 10;
            }
            a /= 10;
        }
        return false;
    }
}
