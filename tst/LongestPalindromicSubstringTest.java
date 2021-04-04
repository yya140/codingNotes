import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
     LongestPalindromicSubstring testInstance = new LongestPalindromicSubstring();

    @Test
    public void longestPalindrome() {
        String test = "abbbacd";
        assertEquals("abbba", testInstance.longestPalindrome(test));
    }
}