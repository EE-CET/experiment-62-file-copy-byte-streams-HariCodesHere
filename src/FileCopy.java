import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            int byteData;
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
            return;
        }

        System.out.println("File Copied");
        try (FileInputStream fis = new FileInputStream(destFile)) {

        } catch (IOException e) {
            System.out.println("Error reading destination file: " + e.getMessage());
        }
    }
}
