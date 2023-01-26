import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class MustangTest extends VehicleTest{
    Mustang mustang;

    protected  void givenVehicleHas0Odomenter15GallonsOfGasAnd20MilesPerGallon() {
        vehicle = new Mustang();
        vehicle.setOdometer(0);
        vehicle.setGallonsOfGas(15);
        vehicle.setMilesPerGallon(20);
    }
    @Test
    public void convertible_WhenConvertibleItIsAConvertible() {
        givenMustangCanBeConveritble();
        whenMustangIsAConvertible();
        thenMustangIsAConvertible();
    }

    private void givenMustangCanBeConveritble() {
        mustang = new Mustang();
    }

    private void whenMustangIsAConvertible() {
        mustang.setConvertible(true);
    }

    private void thenMustangIsAConvertible() {
        assertTrue(mustang.isConvertible());
    }

}
