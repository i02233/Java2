package Lesson_1;

public interface Jumpable {
    boolean jump(double height);
    default void miniJump(){
        System.out.println("jump jump jump");
    };
}
