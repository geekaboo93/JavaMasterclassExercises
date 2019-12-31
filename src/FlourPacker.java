public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 8, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 1; i <= bigCount; i++) {
            int remaining = goal - 5;
            if (remaining == 0) {
                return true;
            } else if (remaining < 0) {
                break;
            }
            goal = remaining;
        }
        if (smallCount >= goal) {
            return true;
        }
        return false;
    }
}
