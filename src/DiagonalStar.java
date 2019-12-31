public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(10);
    }

    public static void printSquareStar(int n) {
        if(n < 5) {
            System.out.println("Invalid Value");
        } else {
            for(int i = 0; i < n; i++) {
                for(int j=0; j < n; j++) {
                    if (j == i || i == 0 || i == n - 1 || j == 0 || j == n - 1 || j == (n - i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
