public class SecondMinutesConverter {
    public static void main(String[] args) {
        System.out.println(getDurationString(299,12));
        System.out.println(getDurationString(5621));
    }

    public static String getDurationString(long mins, long secs) {
        if(mins < 0 || (secs < 0 || secs > 59)) {
            return "Invalid value";
        }
        long hrs = mins / 60;
        long remaindingMins = mins % 60;

        return hrs + "h " + remaindingMins + "m " + secs + "s";

    }

    public static String getDurationString(long secs) {
        if(secs < 0 ) {
            return  "Invalid value";
        }

        long mins = secs / 60;
        long remainingSecs = secs % 60;
        return getDurationString(mins,remainingSecs);
    }
}
