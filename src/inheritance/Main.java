package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        TwoWheeler twoWheeler = new TwoWheeler("TW0001", "Honda", "ABC-2594 BKK");
        FourWheeler fourWheeler = new FourWheeler("FW0001", "Toyota", "4AB-9932 BKK");
        Limousine limousine = new Limousine("LM0001", "Bentley", "SS-9999 BKK");

        twoWheeler.ride();
        fourWheeler.drive();
        limousine.roll();

        List<LandVehicle> landVehicles = new ArrayList<>();
        landVehicles.add(twoWheeler);
        landVehicles.add(fourWheeler);
        landVehicles.add(limousine);

        for (LandVehicle lv : landVehicles) {
            System.out.println(lv);
        }
    }
}
