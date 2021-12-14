package HomeWork1.athletes;

public class Human implements Athlete {
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Human () {
        this(5000,3);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Человек пробежал на беговой дорожке: " + dist + "м.");
            return true;
        } else {
            System.out.println("Человек не смог пробежать на беговой дорожке: " + dist + "м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Человек перепрыгнул стену высотой: " + height + "м.");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть стену высотой: " + height + "м.");
            return false;
        }
    }
}
