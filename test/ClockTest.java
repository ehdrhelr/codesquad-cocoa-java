import day13.shell.clock.Hour;
import org.junit.Test;

public class ClockTest {
    Hour hour = new Hour();

    @Test
    public void testDisplay() {
        int[] time = {12, 0};
        hour.display(time);


    }

}
