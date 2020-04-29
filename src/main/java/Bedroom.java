import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private int rate;

    public Bedroom(int roomNumber, int capacity, String type, int rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.rate = rate;
    }

    public int getRate(){
        return rate;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuests() {
        guests.clear();
    }
}
