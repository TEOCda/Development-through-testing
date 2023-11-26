import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    private PhoneBook phoneBook;
    @BeforeEach
    void setUp () {
        phoneBook = new PhoneBook();
    }
    @Test
    void addTest() {
        Assertions.assertEquals(1,phoneBook.add("Eva", 123));
    }

    @Test
    void  findByNumberTest() {
        phoneBook.add("Eva", 123);
        Assertions.assertEquals("Eva", phoneBook.findByNumber(123));
    }
}
