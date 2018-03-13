package main;

import java.util.Comparator;
import java.util.List;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class PidgeonSorter {

    public List<Pidgeon> sortPidgeonsList(List<Pidgeon> pidgeonsList) {
        pidgeonsList.sort(new Comparator<Pidgeon>() {
            @Override
            public int compare(Pidgeon o1, Pidgeon o2) {
                int yearCompare = o1.getRingID().getYear().compareToIgnoreCase(o2.getRingID().getYear());
                if (yearCompare != 0) {
                    return yearCompare;
                } else {
                    return o1.getRingID().getNumber().compareTo(o2.getRingID().getNumber());
                }
            }
        });

        return pidgeonsList;
    }

}
