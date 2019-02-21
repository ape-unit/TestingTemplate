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

public class ApeHashTests {
    private static int failures = 0;
    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            failures++;
        }
    };






    @AfterClass
    public static void testCompleted() throws Exception {

        if (failures <= 0) {
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
