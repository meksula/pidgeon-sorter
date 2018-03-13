package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class PidgeonProvider {
    private final static String PATTERN = "\\APL[0-9]{4}\\.[0-9]{2}\\.[0-9]{2,5}\\p{Space}[0-1]{1}-[0-1]{1}\\p{Space}[0-9]{2}\\Z";
    private List<Pidgeon> pidgeonList = new ArrayList<>();

    public void collectData(String pidgeon) {
        if (checkIfCorrect(pidgeon)) {
            addPingeonToList(pidgeon);
            System.out.println("Correctly added.");
        } else {
            System.out.println("Error: Please check syntax and try again.");
        }
    }

    protected boolean checkIfCorrect(String pidgeon) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(pidgeon);
        return matcher.matches();
    }

    protected void addPingeonToList(String pidgeon) {
        String [] split = pidgeon.split("\\.");
        String [] split2 = split[2].split(" ");
        ArrayList<String> parameterList = new ArrayList<>();
        parameterList.addAll(Arrays.asList(split));
        parameterList.addAll(Arrays.asList(split2));
        parameterList.remove(2);

        Pidgeon pidgeonObject = new Pidgeon();
        pidgeonObject.setRingID(
                new RingID(parameterList.get(0), parameterList.get(1), parameterList.get(2)));
        pidgeonObject.setSex(parameterList.get(3));
        pidgeonObject.setColor(parameterList.get(4));

        pidgeonList.add(pidgeonObject);
    }

    public List<Pidgeon> giveListOfPidgeons() {
        return this.pidgeonList;
    }
}
