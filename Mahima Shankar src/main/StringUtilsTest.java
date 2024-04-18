package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    private String I1;
    private String I2;
    private String expectedOutput;

    public StringUtilsTest(String I1, String I2, String expectedOutput) {
        this.I1 = I1;
        this.I2 = I2;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {"Hello", "World", "HelloWorld"},       
                {"", "", ""},                           
                {"a", "b", "ab"},                       
                {"abc123", "def456", "abc123def456"},  
                {"   Hello   ", "World   ", "   Hello   World   "}
        });
    }

    @Test
    public void testConcatenate() {
        assertEquals(expectedOutput, StringUtils.concatenate(I1, I2));
    }

    @Test
    public void testReverse() {
        assertEquals(new StringBuilder(I1).reverse().toString(), StringUtils.reverse(I1));
    }

    @Test
    public void testToUpperCase() {
        assertEquals(I1.toUpperCase(), StringUtils.toUpperCase(I1));
    }

    @Test
    public void testTrim() {
        assertEquals(I1.trim(), StringUtils.trim(I1));
    }
}




