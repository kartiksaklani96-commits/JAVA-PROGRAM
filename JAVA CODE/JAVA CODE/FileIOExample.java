import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            writer.write("Hello from FileIOExample!\n");
            writer.write("This is a simple Java file read/write demo.\n");
        } catch (IOException e) {
            System.err.println("Error writing input file: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write("Copied: " + line + "\n");
            }
            System.out.println("File copy completed. Check output.txt");
        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}
