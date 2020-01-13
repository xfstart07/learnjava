package patternzen.ch03.v1;

import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

public class DriverText extends TestCase {
    Mockery context = new JUnit4Mockery();

    @Test
    public void testDriver() {
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();

        context.checking(new Expectations() {{
            // jdk1.11 报错
            oneOf(car).run();
        }});

        driver.drive(car);
    }
}
