package recursionII;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringAbbreviationMatchTest {
    StringAbbreviationMatch test = new StringAbbreviationMatch();
    @Test
    public void main(){
        String s = "laioffercom";
        String t = "6fer3";
        assertEquals(false, test.match(s,t));
    }
}