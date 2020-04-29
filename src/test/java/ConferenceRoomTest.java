import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom("Green room", 4);
        conferenceRoom2 = new ConferenceRoom("Blue room", 6);
        conferenceRoom3 = new ConferenceRoom("Orange room", 111);
    }

    @Test
    public void roomHasName() {
        assertEquals("Green room", conferenceRoom1.getName());
    }
}
