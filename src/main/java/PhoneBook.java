import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
     private Map<String, Integer> phoneBook = new HashMap<>();

    public int add (String name, int number) {
        for (int i = 0; i < phoneBook.size() + 1; i++) {
            if (!phoneBook.containsKey(name)){
                phoneBook.put(name, number);
            }
        }
        return phoneBook.size();
    }

    public String findByNumber (int number) {
        for (String k : phoneBook.keySet()) {
            if (phoneBook.get(k).equals(number)) {
                return k;
            }
        }
        return null;
    }

    public int findByName (String name) {
        return 0;
    }
}
