import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();
    /*
    private static int milesPerGallon = 20;
    private static double gallonsOfGas = 10.00;
    private static int odometer = 0;
*/
  /*  private static int[] milesPerGallon = {20, 25, 15};
    private static double[] gallonsOfGas = {10.0, 8, 12};
    private static int[] odometer = {0, 10000, 20000};
*/
    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        System.out.println("Second Line");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonsOfGas(10.00);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setMilesPerGallon(25);
        yourVehicle.setGallonsOfGas(8.00);
        yourVehicle.setOdometer(10000);
        allVehicles.add(yourVehicle);

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setMilesPerGallon(15);
        ourVehicle.setGallonsOfGas(12);
        ourVehicle.setOdometer(20000);
        allVehicles.add(ourVehicle);

        drive(100);
        drive(60);
    }

    private static void drive(int milesDriven) {
        for (Vehicle vehicle: allVehicles) {
            System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
            vehicle.go(milesDriven);
/*
            vehicle.setGallonsOfGas(vehicle.getGallonsOfGas() - (milesDriven / vehicle.getMilesPerGallon()));
            vehicle.setOdometer(vehicle.getOdometer() + milesDriven);
*/

            System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());

        }
/*        for (int i = 0; i < 3; i++){
            System.out.println("Odometer " + odometer[i] + " Gallons of gas " + gallonsOfGas[i]);
            gallonsOfGas[i] = gallonsOfGas[i] - (milesDriven / milesPerGallon[i]);
            odometer[i] = odometer[i] + milesDriven;
            System.out.println("Odometer " + odometer[i] + " Gallons of gas " + gallonsOfGas[i]);
        }*/
    }
}