package Lesson_1.enums;

public class Main {
    public static void main(String[] args) {
        Planets planet = Planets.Jupiter;

        printInfo(planet);
        for (Planets p : Planets.values()) {
            System.out.println(p);
        }
    }

    public static void printInfo(Planets p){
        System.out.println(p);
    }
}
