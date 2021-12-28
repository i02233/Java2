package HomeWork3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> phoneNumber = phoneBook.getOrDefault(name, new HashSet<>());
        phoneNumber.add(phone);
        phoneBook.put(name, phoneNumber);
    }

    public Set<String> get(String name) {
        return phoneBook.get(name);
    }
}
