package HomeWork1.athletes;

public class Cat implements Athlete {
   private int maxRun;
   private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat () {
        this(1000,5);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Кот пробежал на беговой дорожке: " + dist + "м.");
            return true;
        } else {
            System.out.println("Кот не смог пробежать на беговой дорожке: " + dist + "м.");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println("Кот перепрыгнул стену высотой: " + height + "м.");
            return true;
        } else {
            System.out.println("Кот не смог перепрыгнуть стену высотой: " + height + "м.");
            return false;
        }
    }
}
