package aufgabe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class JUnitFortbewegungsmittelTest {

    private Fortbewegungsmittel testerV;
    private Krankenwagen testerA;
    private Porsche testerP;
    private Fahrrad testerB;

    @Before()
    public void setUp() {
        testerV = new Fortbewegungsmittel(140);
        testerP = new Porsche();
        testerB = new Fahrrad();
        testerA = new Krankenwagen();
    }

    /*
     * Testet Fortbewegungsmittel Klasse auf Exceptions und Funktionalität
     */
    @Test(expected = FahrException.class)
    public void speedShouldNotBeZero() {
        testerV.setSpeed(0);
    }

    @Test(expected = FahrException.class)
    public void speedShouldNotBeNegative() {
        testerV.setSpeed(-1);
    }

    public void testSpeedAdjustmentForFortbewegungsmittel() {
        testerV.setSpeed(141);
        assertEquals(140, testerV.getSpeed(), 1E-10);
    }

    @Test(expected = FahrException.class)
    public void timeShouldNotBeZeroForMove() {
        testerV.setSpeed(5);
        testerV.move(0);
    }

    @Test(expected = FahrException.class)
    public void timeShouldNotBeNegativeForMove() {
        testerV.setSpeed(5);
        testerV.move(-1);
    }

    @Test(expected = FahrException.class)
    public void speedShouldNotBeZeroForMove() {
        testerV.move(5);
    }

    @Test(expected = FahrException.class)
    public void positionShouldNotBeNegative() {
        testerV.setPosition(-1);
    }

    @Test
    public void testSetPostion() {
        testerV.setPosition(42);
        assertEquals(42, testerV.getPosition(), 1E-10);
    }

    @Test
    public void testmove() {
        testerV.setSpeed(2);
        testerV.move(60);
        assertEquals("moving 1 hour with 2km/h", 2, testerV.getPosition(),
                     1e-10);
    }

    /*
     * Testet die Klasse Krankenwagen auf Exceptions und Funktionalität
     */
    @Test
    public void testSiren() {
        // Speed is 0 by default
        assertFalse("Siren is 0 by default.", testerA.isBlaulichtAn());
        testerA.setSpeed(50);
        assertFalse("Siren only starts at 51 km/h", testerA.isBlaulichtAn());
        testerA.setSpeed(51);
        assertTrue("Siren starts at 51 km/h", testerA.isBlaulichtAn());
    }

    @Test
    public void testSpeedAdjustmentForKrankenwagen() {
        testerA.setSpeed(161);
        assertEquals("Speedadjustment to maxspeed", 160, testerA.getSpeed(),
                     1E-10);
    }

    /*
     * Testet die Klasse Porsche auf Exceptions und Funktionalitäten
     */
    public void testSpeedAdjustmentForPorsche() {
        testerP.setSpeed(191);
        assertEquals("Speedadjustment to maxspeed", 190, testerP.getSpeed(),
                     1E-10);
    }

    /*
     * Klasse Fahrrad wird getestet auf Exceptions und Funktionalität
     */
    @Test
    public void testSpeedAdjustmentForFahrrad() {
        testerB.setSpeed(41);
        assertEquals("Speedadjustmen to maxspeed", 40, testerB.getSpeed(),
                     1E-10);
    }
}
