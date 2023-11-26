import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        Assertions.assertEquals(1,phoneBook.add("Eva", 123));
    }

}
