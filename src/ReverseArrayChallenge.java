import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = {9, 12, 6, 55, 33, 17};
        System.out.println("Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int tmp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = tmp;

        }
    }
}
