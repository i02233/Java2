package HomeWork1;

import HomeWork1.athletes.Athlete;
import HomeWork1.athletes.Cat;
import HomeWork1.athletes.Human;
import HomeWork1.athletes.Robot;
import HomeWork1.obstacles.Obstacle;
import HomeWork1.obstacles.Track;
import HomeWork1.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Athlete[] athletes = {
                new Cat(),
                new Human(),
                new Robot()
        };

        Obstacle[] obstacles = {
                new Track(5000),
                new Wall(2)
        };

        for (Athlete a : athletes) {
            for (Obstacle o : obstacles) {
                if(!o.testObstacle(a)){
                    break;
                };
            }
        }

    }
}
