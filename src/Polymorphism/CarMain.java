package Polymorphism;

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accerlerate() {
        return "Car -> accerlerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accerlerate() {
        return "Mitsubishi -> accerlerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accerlerate() {
        return "Ford -> accerlerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public int getCylinder() {
        return super.getCylinder();
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" -> startEngine()";
    }

    @Override
    public String accerlerate() {
        return getClass().getSimpleName() +" -> accerlerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.startEngine());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Landrover");
        System.out.println(ford.startEngine());
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());

        Holden holden = new Holden(6,"Newmodel");
        System.out.println(holden.startEngine());
        System.out.println(holden.startEngine());
        System.out.println(holden.brake());

    }
}
