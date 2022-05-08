import org.junit.Test;
import static org.junit.Assert.*;
public class MaxMinElementsTest {
    @Test
    public void test1(){
        MaxMinElements y = new MaxMinElements();
        int[] x = {1,2,3,4,-44,111,7,8,9};
        assertEquals(-44,y.Min(x));
        assertEquals(111, y.Max(x));
    }
    @Test
    public void test2(){
        MaxMinElements y = new MaxMinElements();
        int[] x = {1,2,3,4,0,111,7,8,1100};
        assertEquals(0,y.Min(x));
        assertEquals(1100, y.Max(x));
    }
    @Test
    public void test3(){
        MaxMinElements y = new MaxMinElements();
        int[] x = {8,9};
        assertEquals(8,y.Min(x));
        assertEquals(9, y.Max(x));
    }
    @Test
    public void test4(){
        MaxMinElements y = new MaxMinElements();
        int[] x = {1};
        assertEquals(1,y.Min(x));
        assertEquals(1, y.Max(x));
    }
    @Test
    public void test5(){
        MaxMinElements y = new MaxMinElements();
        int[] x = {65, 87, 1, 66, 88, 112, 210, -1};
        assertEquals(-1,y.Min(x));
        assertEquals(210, y.Max(x));
    }
}