import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNum;
    private Airport destination;
    private Airport departure;
    private String departureTime;
    private int availableSeats;
    private ArrayList<Integer> remainingSeats;

    public Flight(PlaneType planeType, String flightNum, Airport destination, Airport departure, String departureTime, int availableSeats, int reservedSeats) {
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
        this.remainingSeats = new ArrayList<Integer>();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public Airport getDestination() {
        return destination;
    }

    public Airport getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public ArrayList getReservedSeats() {
        return this.remainingSeats;
    }


    public int countPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (availableSeats >= 1) {
            this.passengers.add(passenger);
            availableSeats -= 1;
        }
    }

//    public int getTotalWeightAfterBookingPassanger(){
//        int totalWeight = 0;
//        for(Passenger passenger : this.passengers){
//            totalWeight += passenger.getNumOfBags();
//        }
//        return totalWeight * 23;
//    }


}
