public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    /**
     *
     * @param barking
     * @param hourOfDay
     * @return
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean result = false;
        if(hourOfDay < 0 || hourOfDay > 23) {
            return result;
        }

        if(barking && (hourOfDay < 8 || hourOfDay > 22)) {
            result = true;
        }
        return result;
    }
}
