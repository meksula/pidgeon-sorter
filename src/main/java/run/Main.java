package run;

import main.*;

import java.util.List;
import java.util.Scanner;

/**
 * @author Karol Meksuła
 * 13-03-2018
 * */

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String pidgeon = "";
        PidgeonProvider pidgeonProvider = new PidgeonProvider();

        while (!pidgeon.equals("exit") || !pidgeon.equals("summary")) {
            System.out.println("Insert pidgeon data [pattern] 'PL0463.14.6260 0-1 NN'");
            System.out.print(">");
            pidgeon = scanner.nextLine();

            if (pidgeon.equals("sum")){
                System.out.println("List:");
                List<Pidgeon> list = pidgeonProvider.giveListOfPidgeons();
                PidgeonSorter pidgeonSorter = new PidgeonSorter();
                pidgeonSorter.sortPidgeonsList(list);
                PidgeonFormatter.showPidgeonsList(list);
                System.out.println();
                System.out.println("Where save .txt file? Input path: [press 'q' if you want go next]");
                String path = scanner.nextLine();
                if (path.equals("q"))
                    return;
                else TxtExporter.export(path, list);
            }

            else if (pidgeon.equals("exit"))
                System.exit(0);

            else {
                pidgeonProvider.collectData(pidgeon);
                System.out.println();
            }
        }
    }
}
