public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,9000));
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        System.out.println(year % 4);

        if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int result = -1;
        if(month <  1 || month >  12 || year < 1 || year > 9999) {
            return result;
        }

        int tempDays = 31;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = tempDays;
                break;
            case 2:
               result = isLeapYear(year) ? tempDays - 2 : tempDays - 3;
               break;
            case 4: case 6: case 9: case 11:
                result = tempDays - 1;
            default:
                break;
        }
        return result;
    }
}
