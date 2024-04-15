import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a person with your name and surname
        Person myself = new Person();
        myself.setId("2020202020"); // Set your ID
        myself.setName("Ani");
        myself.setSurname("Loladze");

        // Create an instance of the PersonManager class
        PersonManager personManager = new PersonManager();

        // Get the list of persons
        List<Person> persons = PersonManager.getPersons();

        // Select one person from the list to share a room with
        Person otherPerson = persons.get(0); // Assuming there is at least one person in the list

        // Create an instance of the Room class
        Room room = new Room();

        // Create an instance of the HotelManager class
        HotelManager hotelManager = new HotelManager();

        // Check-in both persons to the hotel in the same room
        hotelManager.checkIn(myself, room);
        hotelManager.checkIn(otherPerson, room);

        // Print the hotel guests and room information
        hotelManager.displayInfo();
    }
}
