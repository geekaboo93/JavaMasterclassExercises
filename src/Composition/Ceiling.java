package Composition;

public class Ceiling {
    private int height;
    private int paintingColor;

    public Ceiling(int height, int paintingColor) {
        this.height = height;
        this.paintingColor = paintingColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintingColor() {
        return paintingColor;
    }
}
