import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination, int capacity){
     this.destination = destination;
     this.capacity = capacity;
     this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public boolean addPassenger(Person person) {
        if (this.capacity > passengerCount()) {
            this.passengers.add(person);
            return true;
        } else {
            return false;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
