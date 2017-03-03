package inheritance;

public class FourWheeler extends LandVehicle {

    public FourWheeler(String id, String brand, String licenseNumber) {
        super(id, brand, licenseNumber, 4);
    }

    public void drive() {
        System.out.println("Let's drive");
    }
}
