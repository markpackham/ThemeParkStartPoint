package stalls;

public final class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int getRating() {
        return 0;
    }
}
