package Lesson_1;

public class Kangaroo implements Jumpable{

    private final double MAX_JUMP = 3;

    @Override
    public boolean jump(double height) {
        if(height <= MAX_JUMP){
            System.out.printf("Kangaroo jump %.2f meter\n", height);
            return true;
        } else {
            System.out.printf("Kangaroo can't jump %.2f meter\n", height);
            return false;
        }
    }
}
