package main;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class PidgeonSorterTest {
    private PidgeonSorter pidgeonSorter = new PidgeonSorter();
    private List<Pidgeon> pidgeons;
    private final Logger logger = LoggerFactory.getLogger(PidgeonSorterTest.class);

    @Before
    public void prepareList() {
        pidgeons = new ArrayList<>();

        RingID ringID = new RingID("PL0423", "15", "7436");
        RingID ringID1 = new RingID("PL0423", "10", "9006");
        RingID ringID2 = new RingID("PL0423", "17", "2226");
        RingID ringID3 = new RingID("PL0423", "11", "1009");
        RingID ringID4 = new RingID("PL0423", "11", "1006");

        Pidgeon pidgeon = new Pidgeon();
        pidgeon.setRingID(ringID);
        pidgeons.add(pidgeon);

        Pidgeon pidgeon1 = new Pidgeon();
        pidgeon.setRingID(ringID1);
        pidgeons.add(pidgeon1);

        Pidgeon pidgeon2 = new Pidgeon();
        pidgeon.setRingID(ringID2);
        pidgeons.add(pidgeon2);

        Pidgeon pidgeon3 = new Pidgeon();
        pidgeon.setRingID(ringID3);
        pidgeons.add(pidgeon3);

        Pidgeon pidgeon4 = new Pidgeon();
        pidgeon.setRingID(ringID4);
        pidgeons.add(pidgeon4);
    }

    @Test
    public void pidgeonSorterShouldCorrectlySort() {
        assertEquals(5, pidgeons.size());
    }

    @Test
    public void sortShouldBeCorrect() {
        assertEquals(5, pidgeons.size());
        logger.info("Logger działa przynajmniej");
    }
}