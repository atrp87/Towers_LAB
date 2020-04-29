import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public int bedroomCount() {
        return bedrooms.size();
    }

    public void addGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
        bedrooms.add(bedroom);
    }

    public int conferanceRoomCount() {
        return conferenceRooms.size();
    }

    public void addGuestToConferanceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
        conferenceRooms.add(conferenceRoom);
    }

    public void removeGuestFromBedroom(Bedroom bedroom) {
        bedroom.removeGuests();
        bedrooms.remove(bedroom);
    }

    public void removeGuestFromConferanceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuests();
        conferenceRooms.remove(conferenceRoom);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking newBooking = new Booking(bedroom, nights);
        return newBooking;
    }

    public int costForBooking(Booking booking){

        Bedroom bedroom = booking.getBedroom();
        int total = bedroom.getRate() * booking.getNights();
        return total;
    }

    public HashMap fillDiningroom(DiningRoom diningroom) {
        String name = diningroom.getName();
        diningRooms.put(name, diningroom);
        return diningRooms;
    }
}
