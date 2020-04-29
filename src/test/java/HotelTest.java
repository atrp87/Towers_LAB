import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    
    Hotel hotel;
    Bedroom bedroom1;
    ConferenceRoom conferenceRoom1;
    Guest guest1;
    Booking booking1;
    DiningRoom diningRoom1;
    
    @Before
    public void before() {
        hotel = new Hotel();
        ArrayList<Bedroom> allBedrooms = new ArrayList<Bedroom>();
        bedroom1 = new Bedroom(5, 5, "King", 60);
        conferenceRoom1 = new ConferenceRoom("Green room", 4);
        guest1 = new Guest("Dan");
        diningRoom1 = new DiningRoom("Food Place");
        
    }
    
    @Test
    public void emptyRoom() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddGuestToConferanceRoom(){
        hotel.addGuestToConferanceRoom(guest1, conferenceRoom1);
//        hotel.addGuestToConferanceRoom(guest1, conferenceRoom1);
        assertEquals(1, hotel.conferanceRoomCount());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.removeGuestFromBedroom(bedroom1);
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canRemoveGuestFromConferanceRoom(){
        hotel.addGuestToConferanceRoom(guest1, conferenceRoom1);
        hotel.removeGuestFromConferanceRoom(conferenceRoom1);
        assertEquals(0, hotel.conferanceRoomCount());
    }

    @Test
    public void bookBedroom() {
        Booking newBooking = hotel.bookRoom(bedroom1, 3);
        booking1 = new Booking(bedroom1, 3);
        assertEquals(booking1.getNights(), newBooking.getNights());
        assertEquals(3, newBooking.getNights());

    }

    @Test
    public void canGetCost(){
        Booking newBooking = hotel.bookRoom(bedroom1, 3);
        assertEquals(180, hotel.costForBooking(newBooking));
    }

    @Test
    public void canHaveDiningroom() {

        HashMap<String, DiningRoom> result = new HashMap<String, DiningRoom>(){{
            put("Food Place", diningRoom1);
        }};
        assertEquals(result, hotel.fillDiningroom(diningRoom1));
    }
}
