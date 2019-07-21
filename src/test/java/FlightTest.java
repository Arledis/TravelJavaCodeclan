import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {
    Passenger passenger;
    Flight flight;
    PlaneType planeType;
    Airport airport;


    @Before
    public void setUp() throws Exception{
        passenger = new Passenger("Julie Morgan", 1);
        flight = new Flight(PlaneType.BOEING747400,"FR756", Airport.MENORCA, Airport.LONDON, "08:00",3, 0);

    }

    @Test
    public void flightStartsWithoutPassengers(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void hasAFlightNum(){
        assertEquals("FR756", flight.getFlightNum());
    }

    @Test
    public void HasDestination(){
        assertEquals(Airport.MENORCA, flight.getDestination());
    }

    @Test
    public void hasDeparture(){
        assertEquals(Airport.LONDON, flight.getDeparture());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("08:00", flight.getDepartureTime());
    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(3, flight.getAvailableSeats());
    }

    @Test
    public void startsWithoutReservedSeats(){
        assertEquals(0, flight.getReservedSeats().size());
    }


    @Test
    public void canBookPassengerToFlight(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }



}
