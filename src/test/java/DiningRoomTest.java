import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom1;
    Guest guest1;

    @Before
    public void before(){

        diningRoom1 = new DiningRoom("Food Place");
        guest1 = new Guest("Bob");

    }

    @Test
    public void hasName(){
        assertEquals("Food Place",diningRoom1.getName());
    }
}
