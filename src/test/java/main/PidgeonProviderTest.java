package main;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class PidgeonProviderTest {
    private PidgeonProvider pidgeonProvider = new PidgeonProvider();

    @Test
    public void shouldInvokeDataCollector() {
        assertNotNull(pidgeonProvider.giveListOfPidgeons());
    }

    private final String VALID = "PL0463.14.6260 0-1 18";
    private final String INVALID = "322 4433.3334cec3v.c...c,s";

    @Test
    public void shouldCheckIfSyntaxIsCorrect() {
        boolean b = pidgeonProvider.checkIfCorrect(VALID);
        assertTrue(b);
    }

    @Test
    public void shouldAddStringCorrectly() {
        pidgeonProvider.addPingeonToList(VALID);
        assertTrue(pidgeonProvider.giveListOfPidgeons().size() == 1);
    }

    @Test
    public void shouldReturnFalseExceptionCauseRegexNotMatches() {
        boolean b = pidgeonProvider.checkIfCorrect(INVALID);
        assertFalse(b);
    }

    @Test
    public void collectDataShouldInvokePrivateMethodAndInitClassLogic() {
        pidgeonProvider.collectData(VALID);
    }

}