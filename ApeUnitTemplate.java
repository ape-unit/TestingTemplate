import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


import java.awt.Desktop;
import java.net.URL;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApeTests {
    private static int  failures= 0;
    private static int succeded = 0;
    public static final int TIMEOUT = 200;
    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            failures++;
        }
        @Override
        protected void succeeded(Description description) {
            succeded++;
        }
    };

    //@Test(timeout =TIMEOUT)
    //tests go here
    //
    //@Test(expected = NullPointerException.class)

    @AfterClass
    public static void testCompleted() throws Exception {

        if (failures <= 0 && succeeded >= 69 /*test count*/) {
            try {
                Desktop.getDesktop().browse(
                        new URL("https://ape-unit.github.io/"
                                + "ape-invasion/").toURI());
            } catch (Exception e) { }
        } else {
            System.out.println("Ape game not unlocked."
                        + "Please continue to work on your tests.");
        }
    }
}
