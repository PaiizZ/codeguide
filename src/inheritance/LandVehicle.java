package inheritance;

public class LandVehicle {
    private String id;
    private String brand;
    private String licenseNumber;
    private int wheels;

    public LandVehicle(String id, String brand, String licenseNumber, int wheels) {
        this.id = id;
        this.brand = brand;
        this.licenseNumber = licenseNumber;
        this.wheels = wheels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String toString() {
        return String.format("Id: %s, Name: %s, License number: %s", getId(), getBrand(), getLicenseNumber());
    }
}
