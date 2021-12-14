package Lesson_1;

public class Main {
    public static void main(String[] args) {

//        Runnable[] runnables = {
//                new Rabbit(),
//                new Cat("Barsik"),
//                new Cat("Murzik")
//
//        };
//        for (int i = 0; i < runnables.length; i++) {
//            runnables[i].run();
//        }
//        Cat cat = new Cat("Tigr");
//        testRun(cat);
//
//        Jumpable[] jumpables = new Jumpable[3];
//        jumpables[0] = new Cat("Barsik");
//        jumpables[1] = new Rabbit();
//        jumpables[2] = new Kangaroo();
//
//        for (Jumpable j : jumpables) {
//            j.jump(1);
//            j.miniJump();
//
//        }
//        Runnable runnable = new Cat("Tomas");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I run");
            }
        };

        Runnable r = () -> System.out.println("I run");



        testRun(runnable);
        testRun(r);
        testRun(() -> System.out.println("I never run"));

    }

    public static void testRun(Runnable r) {
        r.run();
    }

    public void method1(){
        class Node{
            int x, y;

            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        Node[] nodes = new Node[] {
                new Node(3,5),
                new Node(2,4),
        };
        for (Node node : nodes) {
            System.out.println(node.x + node.y);
        }
    }

}
