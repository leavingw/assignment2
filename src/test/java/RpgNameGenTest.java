import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RpgNameGenTest {

    @Test
    @DisplayName("Returns a nice name composition of more than one name")
    void test_NewNameGood() throws InterruptedException {

        String name = "Johan";

        String goodName = RpgNameGen.NewNameGood(name);

        assertTrue(goodName.contains(name));
        assertTrue(goodName.startsWith(name));
        assertNotEquals(goodName, name);

    }

    @Test
    @DisplayName("Returns a mean name composition of more than one name")
    void newNameBad() throws InterruptedException {

        String name = "Johan";

        String goodName = RpgNameGen.NewNameBad(name);

        assertTrue(goodName.contains(name));
        assertTrue(goodName.startsWith(name));
        assertNotEquals(goodName, name);

    }

    @Test
    @DisplayName("Returns a dumb name composition of more than one name")
    void newNameDumb() throws InterruptedException {

        String name = "Johan";

        String goodName = RpgNameGen.NewNameDumb(name);

        assertTrue(goodName.contains(name));
        assertTrue(goodName.startsWith(name));
        //assertFalse(goodName.equals(name));
        //Found assertNotEquals was smarter since it besides telling me something was wrong, also pointed out what was wrong
        assertNotEquals(goodName, name);

    }
}