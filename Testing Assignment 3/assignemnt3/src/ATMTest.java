import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ATMTest {
    @Test
    public void test1(){
        ATM a = new ATM();
        a.valid_card = false;
        assertEquals("Card not validated",a.enterCard());
    }
    @Test
    public void test2(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
    }
    @Test
    public void test3(){
        ATM a = new ATM();
        assertEquals("Successful login",a.enterPassword());
    }
    @Test
    public void test4(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        a.password_valid = false;
        assertEquals("Wrong password",a.enterPassword());
    }
    @Test
    public void test5(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Enter valid amount",a.deposit(20));
        assertEquals("Not enough balance",a.withdraw(10));
    }
    @Test
    public void test6(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(100));
        assertEquals("Successful withdraw",a.withdraw(50));
    }
    @Test
    public void test7(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(500));
        assertEquals("Successful withdraw",a.withdraw(10));
    }
    @Test
    public void test8(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(3000));
        assertEquals("Successful withdraw",a.withdraw(1500));
        assertEquals("Successful withdraw",a.withdraw(1500));
    }
    @Test
    public void test9(){
        ATM a = new ATM();
        assertEquals("Validated card",a.enterCard());
        assertEquals("Successful login",a.enterPassword());
        assertEquals("Successful deposit",a.deposit(2000));
        assertEquals("Successful withdraw",a.withdraw(1000));
        assertEquals("Not enough balance",a.withdraw(1001));
    }
}