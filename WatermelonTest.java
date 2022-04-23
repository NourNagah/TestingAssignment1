import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {
    @Test
    void EvenShouldWork() {
        var watermelon = new Watermelon();
        assertTrue(watermelon.weight(16));
    }
    @Test
    void OddShouldNotWork() {
        var watermelon = new Watermelon();
        assertFalse(watermelon.weight(7));
    }
    @Test
    void TwoShouldNotWork() {
        var watermelon = new Watermelon();
        assertFalse(watermelon.weight(2));
    }
    @Test
    void LowerThanTwoShouldNotWork() {
        var watermelon = new Watermelon();
        assertFalse(watermelon.weight(-2));
    }

}
