import java.io.File;
import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directoryName = args[0];
        File directory = new File(directoryName);
        if (!directory.isDirectory()) {
            System.out.println("Katalog " + directoryName + "does not isnye.");
            return;
        }
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Katalog " + directoryName + " empty.");
            return;
        }
        System.out.println("In katalozi " + directoryName + " znaideno:");
        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.print("Xotite ydalit? (Y/N): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            for (File file : files) {
                file.delete();
                System.out.println("File " + file.getName() + " vudaleno.");
            }
        } else {
            System.out.println("Skasovano.");
        }
    }
}
