public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int n) {
        if(n < 2) return -1;

        int largestPrime = n;
        for(int i=2; i <= n; i++) {
            while(n % i == 0) {
                n/=i;
                largestPrime = i;
            }
        }
        return largestPrime;
    }
}
