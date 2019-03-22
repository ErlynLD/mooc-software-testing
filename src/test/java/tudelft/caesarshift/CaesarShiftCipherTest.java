package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({"abc, 2, cde", "ghi, 1, hij", "opqr, -3, lmno"})
    public void toCipher(String str, int shift, String expected){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"a, 2, c", "d, 4, h", "x, 5, c"})
    public void singleLetterToCipher(String str, int shift, String expected){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"Abcd, 1, invalid", "224, 1, invalid"})
    public void wrongInputToCipher(String str, int shift, String expected){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"a b, 3, d e", "hello world, 5, mjqqt btwqi"})
    public void inputWithSpacesToChipher(String str, int shift, String expected){
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher();
        String result = caesarShiftCipher.CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expected, result);
    }
}
