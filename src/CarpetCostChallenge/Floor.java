package CarpetCostChallenge;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getArea() {
        if(width < 0 || length < 0)
            return 0;
        return width * length;
    }
}
