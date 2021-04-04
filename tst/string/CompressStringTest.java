package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompressStringTest {
    CompressString testInstance = new CompressString();

    @Test
    public void compress() {
        String inputString = "aabbbcdd";

        assertEquals("a2b3c1d2", testInstance.compress(inputString));


    }
}