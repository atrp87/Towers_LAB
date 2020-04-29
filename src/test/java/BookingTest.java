import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking1;
    Booking booking2;
    Booking booking3;
    Bedroom bedroom1;
    Bedroom bedroom2;

    @Before
    public void before() {
        bedroom1 = new Bedroom(56,1, "big", 40);
        bedroom2 = new Bedroom(532,6, "small", 80);

        booking1 = new Booking(bedroom1, 2);
        booking2 = new Booking(bedroom2, 6);
    }

    @Test
    public void NumberOfNights() {
        booking1.getNights();
        assertEquals(2, booking1.getNights());
    }

}
