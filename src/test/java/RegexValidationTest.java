import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;


public class RegexValidationTest {
    @Test
    public void regexShouldMatchToString() {
        String valid = "PL0463.14.6260 0-1 czarny";
        String invalid = "PL0463.14.6260 1-0 09";

        Pattern pattern = Pattern.compile("\\APL[0-9]{4}\\.[0-9]{2}\\.[0-9]{2,5}\\p{Space}[0-1]{1}-[0-1]{1}\\p{Space}[0-9]{2}\\Z");
        Matcher matcher = pattern.matcher(invalid);
        assertTrue(matcher.matches());
    }
}
