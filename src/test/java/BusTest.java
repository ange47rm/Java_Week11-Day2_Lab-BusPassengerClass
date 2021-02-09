import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private Person person1;
    private Person person2;
    private ArrayList<Person> passengerList;

    @Before
    public void before(){
        bus = new Bus("London", 2);
        person = new Person();
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busHasDestination(){
        assertEquals("London", bus.getDestination());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(2, bus.getCapacity());
    }

    @Test
    public void busIsFull(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        assertEquals(false, bus.addPassenger(person));
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.removePassenger(person1);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void getPassengerList(){
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        passengerList.add(person1);
        passengerList.add(person2);
        assertEquals(passengerList, bus.getPassengerList());
    }
}
