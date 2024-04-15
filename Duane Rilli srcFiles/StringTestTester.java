/**
 * Assignment for CS401
 * Submitted by: Duane Rilli
 * Date: 2024-04-15
 */

package StringTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringTestTester {
    private String input1;
    private String input2;
    private String expectedOutput;

    public StringTestTester(String input1, String input2, String expectedOutput) {
        this.input1 = input1;
        this.input2 = input2;
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
        assertEquals(expectedOutput, StringTestFuncs.concatenate(input1, input2));
    }

    @Test
    public void testReverse() {
        assertEquals(new StringBuilder(input1).reverse().toString(), StringTestFuncs.reverse(input1));
    }

    @Test
    public void testToUpperCase() {
        assertEquals(input1.toUpperCase(), StringTestFuncs.toUpperCase(input1));
    }

    @Test
    public void testTrim() {
        assertEquals(input1.trim(), StringTestFuncs.trim(input1));
    }


}
