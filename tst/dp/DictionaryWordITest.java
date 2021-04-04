package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryWordITest {

    DictionaryWordI test = new DictionaryWordI();

    @Test
    public void canBreakTest() {
        //
        String input = "robcatd";
        String[] dict = new String[]{"rob", "cat", "d"};
        //
        assertEquals(true, test.canBreak(input, dict));
    }

    @Test
    public void canBreakTest1() {
        //
        String input = "fgg";
        String[] dict = new String[]{"rob", "cat", "d"};
        //
        assertEquals(false, test.canBreak(input, dict));
    }

}