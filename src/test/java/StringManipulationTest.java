import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator calculate;

    @BeforeEach
    public void setUp() {
        calculate = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        calculate = null;
    }

    @Test
    public void add1() {
        calculate.setString("This is my string");
        int length = calculate.add();
        assertEquals(4, length);
    }

    @Test
    public void add2() {
        int sum = calculate.add(1,3);
        assertEquals(4, sum);
    }



}
