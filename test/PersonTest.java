import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4;

    @BeforeEach
    void setUp() {


        p1 = new Person("Autumn", "Price", "789456", "Mz.", 1994, 29);
        p2 = new Person("Jayson", "Price", "789987", "Dr.", 1984, 39);
        p3 = new Person("Willow", "Lorraine", "456123", "Esq.", 2022, 1);
        p4 = new Person( "Michael", "Scott","789562", "Esq.", 2050);
    }


    @Test
    void setFirstName() {
        p1.setFirstName("Autumn");
        assertEquals("Autumn", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p2.setLastName("Price");
        assertEquals("Price", p2.getLastName());
    }

    @Test
    void setID() {
        p3.setID("456123");
        assertEquals("456123", p3.getID());
    }

    @Test
    void setTitle() {
        p4.setTitle("Esq.");
        assertEquals("Esq.", p4.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(2050);
        assertEquals(2050, p1.getYOB());
    }

    @Test
    void fullName() {
        p2.fullName("Jayson", "Price");
        assertEquals("Jayson Price", p2.fullName("Jayson", "Price"));
    }

    @Test
    void formalName() {
        p3.formalName("Esq.", "Willow Lorraine");
        assertEquals("Esq. Willow Lorraine", p3.formalName("Esq.", "Willow Lorraine"));
    }

    @Test
    void setAge() {
        p1.getAge();
        assertEquals(28, p1.getAge());
    }

    @Test
    void toCSVDataRecord() {
        p1.toCSVDataRecord("789456", "Autumn", "Price", "Mz.", 1994);
        assertEquals("Autumn, Price, 789456, Mz., 1994, 29", p1.toCSVDataRecord("789456", "Autumn", "Price", "Mz.",  1994));
    }


}