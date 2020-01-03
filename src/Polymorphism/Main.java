package Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaw extends Movie{
    public Jaw() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eat lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the earth";
    }
}

class Mazerunner extends  Movie {
    public Mazerunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Whatever it is";
    }
}

class StarWars extends  Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Whatever it is";
    }
}

class Forgetable extends  Movie {
    public Forgetable() {
        super("Forgetable");
    }

    @Override
    public String plot() {
        return "Whatever it is";
    }
}


public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
            + "Plot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaw();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Mazerunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
