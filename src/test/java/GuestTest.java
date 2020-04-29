import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        guest1 = new Guest("Dan");
        guest2 = new Guest("John");
        guest3 = new Guest("Jess");
    }

    @Test
    public void guestHasName() {
        assertEquals("Dan", guest1.getName());
    }


}
