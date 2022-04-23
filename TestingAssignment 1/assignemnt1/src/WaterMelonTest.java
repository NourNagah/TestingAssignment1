import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterMelonTest {
    @Test
    void EvenShouldWork() {
        var watermelon = new WaterMelon();
        assertTrue(watermelon.weight(16));
    }
    @Test
    void OddShouldNotWork() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(7));
    }
    @Test
    void TwoShouldNotWork() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(2));
    }
    @Test
    void LowerThanTwoShouldNotWork() {
        var watermelon = new WaterMelon();
        assertFalse(watermelon.weight(-2));
    }

}