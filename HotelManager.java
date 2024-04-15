import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private final Map<String, Room> guestRooms;

    public HotelManager() {
        this.guestRooms = new HashMap<>();
    }

    public void checkIn(Person person, Room room) {
        if (guestRooms.containsKey(person.getId())) {
            System.out.println(person.getName() + " is already checked in.");
        } else {
            room.checkIn(person);
            guestRooms.put(person.getId(), room);
        }
    }

    public void checkOut(String personId) {
        Room room = guestRooms.get(personId);
        if (room != null) {
            room.checkOut();
            guestRooms.remove(personId);
        } else {
            System.out.println("Person with ID " + personId + " is not checked in.");
        }
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : guestRooms.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person person = room.getOccupant();
            System.out.println("ID: " + personId + ", Name: " + person.getName() + ", Room: " + room.getRoomNumber());
        }
    }
}
