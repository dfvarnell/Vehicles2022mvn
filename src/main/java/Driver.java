import javax.swing.*;
import java.util.ArrayList;

public class Driver {
    private static final ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        promptUser();
        displayOutput();
    }
    private static void promptUser() {
        System.out.println("Second Line");
        int goAgain = JOptionPane.NO_OPTION;

        do {
            String nickName = JOptionPane.showInputDialog("What is the nickname of this vehicle.");
            Vehicle vehicle = new Vehicle();
            String strMilesPerGallon = JOptionPane.showInputDialog("Enter miles per gallon.");
            int milesPerGallon = Integer.parseInt(strMilesPerGallon);
            vehicle.setMilesPerGallon(milesPerGallon);

            String strGallonsOfGas = JOptionPane.showInputDialog("Enter gallons of gas");
            double gallonsOfGas = Double.parseDouble(strGallonsOfGas);
            vehicle.setGallonsOfGas(gallonsOfGas);

            String strOdometer = JOptionPane.showInputDialog("Enter Odometer.");
            int odometer = Integer.parseInt(strOdometer);
            vehicle.setOdometer(odometer);
            allVehicles.add(vehicle);

            goAgain = JOptionPane.showConfirmDialog(null, "Do you want to enter another vehicle?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (goAgain == JOptionPane.YES_OPTION);
    }
    private static void displayOutput() {
        do {
            String strMilesDriven = JOptionPane.showInputDialog("How far do you want to go?");
            int milesDriven = Integer.parseInt(strMilesDriven);

            for (Vehicle vehicle : allVehicles) {
                System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
                vehicle.go(milesDriven);

                System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
            }
        } while (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you want to take another trip?", "Go Again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }
}