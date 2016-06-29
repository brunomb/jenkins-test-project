package android.dev.brunomb.jenkinstestproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void string_test() throws Exception {
        assertEquals("nothing","nothing");
        assertNotEquals("nothing","everything");
    }

    @Test
    public void int_isCorrect() throws Exception {
        assertEquals(1,1);
        assertNotEquals(1,42);
    }
}