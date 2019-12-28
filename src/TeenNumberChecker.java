public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 24));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int first, int second , int third) {
        boolean result = false;
        if(first >= 13 && first <= 19) {
            result = true;
        } else if(second >= 13 && second <= 19) {
            result = true;
        } else if(third >= 13 && third <= 19) {
            result = true;
        }
        return result;
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }

}
