public class PerfectFactor {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int n) {
        if(n < 1) {
            return false;
        } else {
            int sum = 0;
           for(int i = 1; i < n; i++) {
               if(n%i == 0) {
                   sum += i;
               }
           }
           if(sum == n)
               return true;
           return false;
        }
    }
}
