import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class digital_watchTest {
    @Test
    void test1() {
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
    }
    @Test
    public void test2(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
    }
    @Test
    public void test3(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Already turned on",d.turnOn());
        assertEquals("Turned off",d.turnOff());
    }
    @Test
    public void test4(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
    }
    @Test
    public void test5(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        assertEquals("Wait for timer to end",d.doSomething());
    }
    @Test
    public void test6(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.timer_state = false;
        assertEquals("Accepted",d.doSomething());
    }
    @Test
    public void test7(){
        digital_watch d = new digital_watch();
        assertEquals("Turned On!",d.turnOn());
        assertEquals("Timer set",d.setTimer(10));
        d.timer_state = false;
        assertEquals("Accepted",d.doSomething());
        assertEquals("Turned off",d.turnOff());
    }
}
