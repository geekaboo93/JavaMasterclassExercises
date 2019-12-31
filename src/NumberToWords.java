public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(234);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int n) {
        if(n < 0) {
            System.out.println("Invalid Value");
        }
            String result = "";
            String delimeter = "";
            int digitCount = getDigitCount(n);
            while(digitCount > 0) {
                int key = n%10;
                n/=10;
                String message = "";
                switch (key) {
                    case 0:
                         message = "Zero";
                        break;
                    case 1:
                        message = "One";
                        break;
                    case 2:
                        message = "Two";
                        break;
                    case 3:
                        message = "Three";
                        break;
                    case 4:
                        message = "Four";
                        break;
                    case 5:
                        message = "Five";
                        break;
                    case 6:
                        message = "Six";
                        break;
                    case 7:
                        message = "Seven";
                        break;
                    case 8:
                        message = "Eight";
                        break;
                    case 9:
                        message = "Nine";
                        break;
                    default:
                        break;
                }
                result = message + delimeter + result;
                delimeter = " ";
                digitCount --;
        }
        System.out.println(result);;
    }

    public static int reverse(int n) {
        int factor = 1;
        if (n < 0) factor = -1;
        n = Math.abs(n);
        int reverse = 0;
        while (n > 0) {
            reverse *= 10;
            reverse += n % 10;
            n = n / 10;
        }
        return reverse * factor;
    }

    public static int getDigitCount(int n) {
        if (n < 0)
            return -1;
        int digitCount = 1;
        while (n > 9) {
            digitCount++;
            n = n / 10;
        }
        return digitCount;
    }
}
