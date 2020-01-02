package WallArea;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height < 0 ? 0 : height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        if(this.width < 0 || this.height < 0)
            return 0;
        return this.width * this.height;
    }
}
