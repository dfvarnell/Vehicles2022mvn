import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    protected Vehicle vehicle;
    @Test
    //GivenWhenThen
    protected  void go_increaseOdometerBy100AndDecreaseGallonsOfGasBy5WhenMilesPerGallonIs20() {
        givenVehicleHas0Odomenter15GallonsOfGasAnd20MilesPerGallon();
        whenDrive100();
        thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5();
    }

    protected  void givenVehicleHas0Odomenter15GallonsOfGasAnd20MilesPerGallon() {
        vehicle = new Vehicle();
        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);
    }

    protected  void whenDrive100() {
        vehicle.go(100);
    }

    protected  void thenOdometerIncreasesBy100AndGallonsOfGasDecreasesBy5() {
        assertEquals(100, vehicle.getOdometer());
        assertEquals(10, vehicle.getGallonsOfGas());
    }

}
