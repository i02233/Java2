package HomeWork1.athletes;

public class Robot implements Athlete {
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot () {
        this(50000,1);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Робот пробежал на беговой дорожке: " + dist + "м.");
            return true;
        } else {
            System.out.println("Робот не смог пробежать на беговой дорожке: " + dist + "м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Робот перепрыгнул стену высотой: " + height + "м.");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть стену высотой: " + height + "м.");
            return false;
        }
    }

}
