package Lesson_1;

public interface RunJumpable extends Runnable, Jumpable{
    @Override
    default void run() {

    }
}
