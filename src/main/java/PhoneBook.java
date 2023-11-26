import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
     Map<String, Integer> phoneBook = new HashMap<>();

    public int add (String name, int number) {
        for (int i = 0; i < phoneBook.size() + 1; i++) {
            if (!phoneBook.containsKey(name)){
                phoneBook.put(name, number);
            }
        }
        return phoneBook.size();
    }
}
