import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("London", 2);
        person = new Person();
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
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(false, bus.addPassenger(person));
    }
}
