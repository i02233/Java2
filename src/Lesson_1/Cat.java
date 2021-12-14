package Lesson_1;

public class Cat implements RunJumpable{
    private String name;

    private final double MAX_JUMP = 2;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " run");
    }

    @Override
    public boolean jump(double height) {
        if(height <= MAX_JUMP){
            System.out.printf("Cat %s jump %.2f meter\n", name, height);
            return true;
        } else {
            System.out.printf("Cat %s can't jump %.2f meter\n", name, height);
            return false;
        }

    }

    @Override
    public void miniJump() {
        System.out.println("Cat " + name + " jump...");
    }
}
