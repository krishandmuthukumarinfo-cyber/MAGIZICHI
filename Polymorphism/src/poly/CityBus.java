
package poly;

class CityBus extends Transport {

    CityBus(int passengerId, String passengerName, String fromCity, String toCity, double distance) {
        super(passengerId, passengerName, fromCity, toCity, distance);
    }

    @Override
    void calculateFare() {
        fare = distance * 5;
    }
} 
