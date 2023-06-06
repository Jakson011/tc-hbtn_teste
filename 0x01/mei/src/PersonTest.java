import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person = new Person();

    @BeforeEach
    public void setup() {
        person.setBirthDate(1947);
    }

    @Test
    void show_full_name() {
        person.setName("Paul");
        person.setSurname("McCartney");
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary() {
        person.setSalary(1200f);
        assertEquals(14400.0, person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI(){
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);

        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);

        assertFalse(person.isMEI());
    }
}
