package HomeWork1.obstacles;

import HomeWork1.athletes.Athlete;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean testObstacle(Athlete a) {
        return a.jump(height);
    }
}
