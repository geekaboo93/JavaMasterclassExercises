public class SecondMinutesConverter {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(-1,12));
        System.out.println(getDurationString(5621));
    }

    private static String getDurationString(long mins, long secs) {
        if(mins < 0 || (secs < 0 || secs > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hrs = mins / 60;
        long remaindingMins = mins % 60;

        return formatTime(hrs) + "h " + formatTime(remaindingMins) + "m " + formatTime(secs) + "s";

    }

    private static String getDurationString(long secs) {
        if(secs < 0 ) {
            return  INVALID_VALUE_MESSAGE;
        }

        long mins = secs / 60;
        long remainingSecs = secs % 60;
        return getDurationString(mins,remainingSecs);
    }

    private static String formatTime(long time) {
        String timeStr = ""+time;
        if(time < 10) {
            timeStr = "0" + timeStr;
        }
        return timeStr;
    }
}
