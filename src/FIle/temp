package FIle;

import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        if (args.length != 2) {
            System.out.println("Use: CompFile file1 file2");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]); FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f1.read();
                if (i != j) {
                    break;
                }
            } while (i != -1 && j != -1);

            if (i != j) {
                System.out.println("Various");
            } else {
                System.out.println("Similar");
            }
        } catch (IOException exc) {
            System.out.println("Error input-output: " + exc);
        }
    }
}
