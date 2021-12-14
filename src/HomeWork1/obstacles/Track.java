package HomeWork1.obstacles;

import HomeWork1.athletes.Athlete;

public class Track implements Obstacle {
    private int dist;

    public Track(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean testObstacle(Athlete a) {
        return a.run(dist);
    }
}
