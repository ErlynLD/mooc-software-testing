package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    @ParameterizedTest
    @CsvSource({
            "holaloh, hola" , "abunttuba, abu",
            "saludos, s"     , "GrandiosG, G",
            "ParecidodiceraP, Parecido",
            "ErlynLeb, ''"
    })
    public void mirrorsTest(String origin, String expected){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds(origin);
        Assertions.assertEquals(expected, result);
    }
}
