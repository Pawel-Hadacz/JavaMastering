package mastering.repetition;

import org.w3c.dom.ls.LSOutput;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }
    @Override
    public String plot(){
        return "A shark eats people";
    }
}
class Hangover extends Movie{
    public Hangover() {
        super("Hangover");
    }
    @Override
    public String plot(){
        return "drunk peaople there";
    }
}
class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }
    @Override
    public String plot(){
        return "Kids locked in maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("Star wars");
    }

    @Override
    public String plot() {
        return "Jedi and others";
    }
}
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetanle");
    }
}




public class Main {
    public static void main(String[] args) {
/*        for(int i = 0; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie: " + i + " : " + movie.getName() +"\n" + "Plot " + movie.plot() + "\n");*/

        //}
        Audi a1 = new Audi("C1", 2,"red",50);
        a1.accelerate(20);
        System.out.println(a1.getSpeed());
        for(int i = 0; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Movie: " + i + " : " + car.getName() + "\n" + "Plot " + car.startEngine() + "\n");
        }
            }
    public static Movie randomMovie(){
        int random = (int) (Math.random()*5) + 1;
        System.out.println("random: " +random);
        switch (random){
            case 1:
                return new Jaws();
            case 2:
                return new StarWars();
            case 3:
                return new Hangover();
            case 4:
                return new MazeRunner();
            case 5:
                return new Forgetable();
        }
        return null;

    }
    public static Car randomCar(){
        int random = (int) (Math.random()*3) + 1;
        System.out.println("random: " +random);
        switch (random){
            case 1:
                return new Audi("A3",5,"blue",0);
            case 2:
                return new Toyota("G4",4,"red",5);
            case 3:
                return new Volvo("V4",6,"black",20);

        }
        return null;

    }


}
