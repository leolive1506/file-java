import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
  public static void main() {
    String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
    // String path = "../in.txt";
    String path = "../out.txt";

    // try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line: lines) {
        bw.write(line);
        bw.newLine();
      }

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
