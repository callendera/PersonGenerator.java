import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PersonReader {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File document = chooser.getSelectedFile();
            try {
                Scanner input = new Scanner(document);
                System.out.printf("%s\t\n","ID#\tFirstname\tLastname\tTitle\tYOB");
                System.out.println("======================================");
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] rec = line.split(",");
                    System.out.format("%s\t\n",  line);

                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found!!!");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
