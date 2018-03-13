package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class TxtExporter {
    public static void export(String path, List<Pidgeon> pidgeonsList) {
        try {
            String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            File pidgeons = new File(path);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pidgeons));

            bufferedWriter.write(timeLog);

            for (Pidgeon p : pidgeonsList) {
                bufferedWriter.write(p.toString() + System.lineSeparator());
            }

            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Written to: " + pidgeons.getCanonicalPath());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
