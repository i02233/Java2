package Lesson_2;

public class Main {
    public static void main(String[] args) {

        try{
            int a = 0;
            int b = 15;
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("END");
    }
}
