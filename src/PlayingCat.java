public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int minTemp = 25;
        int maxTemp = isSummer ? 45 : 35;
        boolean isPlaying = false;

        if(temp >= minTemp && temp <= maxTemp) {
            isPlaying = true;
        }
        return isPlaying;
    }
}
