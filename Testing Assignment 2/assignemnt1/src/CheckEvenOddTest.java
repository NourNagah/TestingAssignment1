import org.junit.Test;
import static org.junit.Assert.*;
public class CheckEvenOddTest {
    @Test
    public void even1() {
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 4;
        assertEquals("Even", x.check(n));
    }

    @Test
    public void even2() {
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 20;
        assertEquals("Even", x.check(n));
    }

    @Test
    public void odd1() {
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 7;
        assertEquals("Odd", x.check(n));
    }

    @Test
    public void odd2() {
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 11;
        assertEquals("Odd", x.check(n));
    }

    @Test
    public void zero() {
        CheckEvenOdd x = new CheckEvenOdd();
        int n = 0;
        assertEquals("Even",x.check(n));
    }
    @Test(expected = IllegalArgumentException.class)
    public void negative(){
        CheckEvenOdd x = new CheckEvenOdd();
        int n = -4;
        x.check(n);
    }
}
