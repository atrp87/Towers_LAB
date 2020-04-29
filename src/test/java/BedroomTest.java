import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(5, 5, "King", 60);
        bedroom2 = new Bedroom(33, 1, "Double", 20);
        bedroom3 = new Bedroom(7, 6, "Queen", 35);

    }

    @Test
    public void roomHasNumber() {
        assertEquals(5, bedroom1.getRoomNumber());
    }


}
