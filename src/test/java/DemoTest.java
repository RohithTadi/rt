import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void test1(){
        Demo a = new Demo();
        assertEquals("it is a prime number",a.Prime(2));
    }
}
