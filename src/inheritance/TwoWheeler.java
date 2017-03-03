package inheritance;

public class TwoWheeler extends LandVehicle {

    public TwoWheeler(String id, String brand, String licenseNumber) {
        super(id, brand, licenseNumber, 2);
    }

    public void ride() {
        System.out.println("Let's ride");
    }
}
