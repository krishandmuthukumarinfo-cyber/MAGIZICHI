
package poly;
class LuxuryBus extends Transport {

    LuxuryBus(int passengerId, String passengerName,
              String fromCity, String toCity, double distance) {
        super(passengerId, passengerName, fromCity, toCity, distance);
    }

    @Override
    void calculateFare() {
        fare = (distance * 10) + 200;
    }
}