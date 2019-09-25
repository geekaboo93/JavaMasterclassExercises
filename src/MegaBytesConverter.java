public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    /**
     *
     * @param kiloBytes
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // invalid value
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaByte = kiloBytes / 1024;
        int remaining = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaByte + " MB and "+ remaining + " KB");

    }
}