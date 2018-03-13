package main;

import java.util.List;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class PidgeonFormatter {

    public static void showPidgeonsList(List<Pidgeon> list) {
        int counter = 0;
        for (Pidgeon p : list) {
            counter++;
            System.out.println(counter + " | " + p.getRingID().toString() + " | " + p.getSex() + " | " + p.getColor());
        }
    }
}
