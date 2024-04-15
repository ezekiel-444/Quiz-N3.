public class Room {
    private Person occupant;

    public Room() {
        this.occupant = null;
    }

    public Person getOccupant() {
        return occupant;
    }

    public void checkIn(Person person) {
        this.occupant = person;
        System.out.println(person.getName() + " checked in.");
    }

    public void checkOut() {
        if (occupant != null) {
            System.out.println(occupant.getName() + " checked out.");
            occupant = null;
        } else {
            System.out.println("Room is not occupied.");
        }
    }

    public String getRoomNumber() {
        return null;
    }
}


