import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicsTest {
    @Test
    void Space3D() {
        var Phy = new Physics();
        int x[] = {1, 0, -1};
        int y[] = {2, 0, -2};
        int z[] = {3, 0, -3};
        assertTrue(Phy.Space(3, x, y, z));
    }

    @Test
    void Space2D() {
        var phy = new Physics();
        int x[] = {4, 2};
        int y[] = {6, 9};
        int z[] = {-11, 11};
        assertFalse(phy.Space(2, x, y, z));
    }

    @Test
    void Space1D() {
        var phy = new Physics();
        int x[] = {0};
        int y[] = {0};
        int z[] = {0};
        assertTrue(phy.Space(1, x, y, z));
    }
    @Test
    void NShouldNotBeZero() {
        var phy = new Physics();
        int x[] = {1};
        int y[] = {1};
        int z[] = {1};
        assertThrows(IllegalArgumentException.class, () -> { phy.Space(0, x, y, z);});
    }
    @Test
    void NShouldNotBeBelowZero() {
        var phy = new Physics();
        int x[] = {0};
        int y[] = {0};
        int z[] = {0};
        assertThrows(IllegalArgumentException.class, () -> { phy.Space(-1, x, y, z);});
    }
}
