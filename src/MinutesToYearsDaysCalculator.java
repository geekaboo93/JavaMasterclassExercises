public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(0);
        printYearsAndDays(1440);
        printYearsAndDays(525600);
        printYearsAndDays(581760);
    }

    public static void printYearsAndDays(long mins) {
        if(mins < 0) {
            System.out.println("Invalid Value");
        } else {
            long hrs =  60;
            long days = hrs * 24;
            long years = days * 365;

            if(mins > 0) {
                long minsToYears = mins/years;
                long minsToDays =  mins%years/days;
                System.out.println(mins+ " min = "+ minsToYears + " y and "+ minsToDays + " d");
            } else {
                System.out.println(mins+ " min = 0 y and 0 d");
            }
        }
    }
}
