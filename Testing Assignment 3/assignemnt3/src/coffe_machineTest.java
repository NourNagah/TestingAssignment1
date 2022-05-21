import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class coffe_machineTest {
    @Test
    public void test1() {
        coffe_machine c = new coffe_machine();
        assertEquals("Please turn the machine on", c.addMoney(30));
    }
    @Test
    public void test2() {
        coffe_machine c = new coffe_machine();
        assertEquals("Power on" + "Lights on", c.openMachine());
    }
    @Test
    public void test3() {
        coffe_machine c = new coffe_machine();
        c.power = true;
        assertEquals("Error!", c.openMachine());
    }
    @Test
    public void test4() {
        coffe_machine c = new coffe_machine();
        c.openMachine();
        c.closeMachine();
        assertEquals("Please turn the machine on", c.addMoney(30));
    }
    @Test
    public void test5() {
        coffe_machine c = new coffe_machine();
        c.openMachine();
        assertEquals("money added Successfully", c.addMoney(30));
    }
    @Test
    public void test6() {
        coffe_machine c = new coffe_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
    }
    @Test
    public void test7(){
        coffe_machine c = new coffe_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals("Lights off" + "Power off",c.closeMachine());
    }
    @Test
    public void test8(){
        coffe_machine c = new coffe_machine();
        assertEquals("Please turn the machine on",c.makeCoffee(2));
    }
    @Test
    public void test9(){
        coffe_machine c = new coffe_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals(2+ " Coffee successfuly made",c.makeCoffee(3));
    }
    @Test
    public void test10(){
        coffe_machine c = new coffe_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals(2+ " Coffee successfuly made",c.makeCoffee(4));
    }
    @Test
    public void test11(){
        coffe_machine c = new coffe_machine();
        assertEquals("Power on" + "Lights on",c.openMachine());
        assertEquals("money added Successfully",c.addMoney(30));
        assertEquals(1+ " Coffee successfuly made",c.makeCoffee(1));
    }
}
