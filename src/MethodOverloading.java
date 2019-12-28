public class MethodOverloading {
    public static void main(String[] args) {
        double cm = calcFeetAndInchesToCentimeters(13, 1);
        if(cm < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double ft, double inches) {
        if(ft < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        double cm  = (ft * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(ft + " feet, " + inches + " inches = "+ cm + " cm");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches in equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
