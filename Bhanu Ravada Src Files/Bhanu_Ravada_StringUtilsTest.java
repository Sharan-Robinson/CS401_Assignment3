package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringUtilsTest {

    private String input1;
    private String input2;
    private String expectedOutput;

    public StringUtilsTest(String input1, String input2, String expectedOutput) {
        this.input1 = input1;
        this.input2 = input2;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
        	{"Hello", "World", "HelloWorld"},       
            {"", "", ""},                           
            {"c", "a", "ca"},                       
            {"123abc", "456bha", "123abc456bha"},  
            {"   Hello   ", "World   ", "   Hello   World   "}
        });
    }

    @Test
    public void testConcatenate() {
        
    	String actualResult = StringUtils.concatenate(input1, input2);
    	assertEquals(expectedOutput,actualResult);
    }

    @Test
    public void testReverse() {
        String actualResult1 = StringUtils.reverse(input1);
    	assertEquals(new StringBuilder(input1).reverse().toString(), actualResult1);
    }

    @Test
    public void testToUpperCase() {
        String actualResult2 = StringUtils.toUpperCase(input1);
    	assertEquals(input1.toUpperCase(), actualResult2);
    }

    @Test
    public void testTrim() {
    	String actualResult3 = StringUtils.trimWhiteSpace(input1);
    	assertEquals(input1.trim(), actualResult3);
    }
}
