package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource({"ggrereer", "ggg7788"})
    public void gHappyBeginning(String str){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(true, result);
    }

    @ParameterizedTest
    @CsvSource({"dfdfdgg", "tthggg"})
    public void gHappyEnding(String str){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(true, result);
    }

    @ParameterizedTest
    @CsvSource({"gueu334", "trghtttg", "333fdfdgerweg"})
    public void notGHappy(String str){
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(false, result);
    }
}
