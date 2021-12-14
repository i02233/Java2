package Lesson_1;

public class Rabbit implements RunJumpable{
    private final double MAX_JUMP = 0.5;

    @Override
    public void run() {
        System.out.println("Rabbit run");
    }

    @Override
    public boolean jump(double height) {
        if(height <= MAX_JUMP){
            System.out.printf("Rabbit jump %.2f meter\n", height);
            return true;
        } else {
            System.out.printf("Rabbit can't jump %.2f meter\n", height);
            return false;
        }
    }
}
