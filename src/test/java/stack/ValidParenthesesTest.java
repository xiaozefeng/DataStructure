package stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        String str1 = "([{}])";
        String str2 = "([)]";
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid(str1));
        Assert.assertTrue(!validParentheses.isValid(str2));
    }
}