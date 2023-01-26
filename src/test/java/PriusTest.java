import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriusTest {
    private Prius prius;

    @Test
    public void go_runningWithGas() {
        givenGallonsOfGas100odometer0MilesPerGallon50Charge4();
        whenDriven100Miles();
        thenGallonsOfGas8Odometer100MilliampsHours9();
    }

    private void givenGallonsOfGas100odometer0MilesPerGallon50Charge4() {
        prius = new Prius();
        prius.setGallonsOfGas(10);
        prius.setOdometer(100);
        prius.setMilesPerGallon(50);
        prius.SetCharge(9);
    }

    private void whenDriven100Miles() {
        prius.go(100);
    }

    private void thenGallonsOfGas8Odometer100MilliampsHours9() {
        Assertions.assertEquals(10, prius.getGallonsOfGas());
        Assertions.assertEquals(200, prius.getOdometer());
        Assertions.assertEquals(5, prius.getCharge());
    }
    @Test
    public void go_runningWithEWlectricity() {
        givenGallonsOfGas100odometer100MilliampHours9();
        whenDriven100Miles();
        thenGallonsOfGas10Odometer200Charge5();
    }
    private void givenGallonsOfGas100odometer100MilliampHours9() {
        prius = new Prius();
        prius.setGallonsOfGas(10);
        prius.setOdometer(100);
        prius.setMilesPerGallon(50);
        prius.SetCharge(9);
    }
    private void thenGallonsOfGas10Odometer200Charge5() {
        Assertions.assertEquals(10, prius.getGallonsOfGas());
        Assertions.assertEquals(200, prius.getOdometer());
        Assertions.assertEquals(5, prius.getCharge());
    }
}