import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Jane Doe", 1);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Jane Doe", passenger.getName());
    }

    @Test

    public void passengerBagsCheckIn(){
        assertEquals(1, passenger.getNumOfBags());
    }

}
