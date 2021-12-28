package HomeWork3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"black", "white", "yellow", "black", "gray", "yellow", "white", "blue", "yellow", "white", "red", "blue", "black", "gray", "orange"};
        System.out.println(Arrays.toString(words));

        Map<String, Integer> map = new HashMap<>();
        for (String x : words) {
            Integer count = map.getOrDefault(x, 0);
            map.put(x, count + 1);
        }
        System.out.println(map);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван", "+77024115648");
        phoneBook.add("Иванов Иван", "+77014587470");
        System.out.println(phoneBook.get("Иванов Иван"));

        phoneBook.add("Иванова Наталья", "+77013658587");
        System.out.println(phoneBook.get("Иванова Наталья"));

        phoneBook.add("Иванова Ирина", "+77771253456");
        System.out.println(phoneBook.get("Ирина"));

        phoneBook.add("Иван", "+77013658524");
        System.out.println(phoneBook.get("Иван"));

    }
}
