package Lesson_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);
        System.out.println(list);
        list.addAll(0, Arrays.asList(8,7,6,5,4,5,6,7,6));
        System.out.println(list);

//        list.remove((Integer)(4));
//        System.out.println(list);

//        list.removeIf(x->x>=4 && x <=7);
//        list.removeIf(x->x % 2 !=0);
//        list.removeAll(Arrays.asList(3,6,9));


        System.out.println(list.get(2));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.replaceAll(x -> x <= 6 ? x * 2 : -x);
        System.out.println(list);
    }
}
