package android.dev.brunomb.jenkinstestproject;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    public ApplicationTest() {
        super(Application.class);
        assertEquals("a","b");
    }

    public void testNothing() {
        assertEquals("a","b");
    }

}