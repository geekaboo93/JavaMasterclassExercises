package Encapsulation;

public class Printer {
    public int tonerLevel;
    public int pagesPrinted;
    public boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
//        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            if (tonerAmount + this.tonerLevel > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
            }
        } else {
            this.tonerLevel = -1;
        }
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

}
