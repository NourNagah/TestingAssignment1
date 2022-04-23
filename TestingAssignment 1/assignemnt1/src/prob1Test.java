import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class prob1Test {
    @Test
    public void canbedevided (){
        assertEquals("YES", prob1.watermelon(50));
        assertEquals("YES", prob1.watermelon(44));}
    @Test
    public void cannotbedevided(){
        assertEquals("NO", prob1.watermelon(25));
        assertEquals("NO", prob1.watermelon(2));}
    @Test
    public void outofrange(){
        assertEquals("input w out of range", prob1.watermelon(150));}
    }
