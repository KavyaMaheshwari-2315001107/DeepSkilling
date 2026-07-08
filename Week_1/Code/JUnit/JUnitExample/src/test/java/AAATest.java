
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AAATest {
    Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator();
        System.out.println("Setup completed");
    }
    @Test
    public void testAddition(){
        int a = 10;
        int b = 20;
        int result = calculator.add(a,b);
        assertEquals(30,result);
    }
    @After
    public void tearDown(){
        calculator = null;
        System.out.println("Testing completed");
    }
}