import java.io.File;
import java.util.Scanner;

public class InfoDirectoryPath {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a folder path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    // so nome
    System.out.println("Get name: " + path.getName());
    // so caminho
    System.out.println("Get parent: " + path.getParent());
    System.out.println("Get path: " + path.getPath());
    System.out.println("Get absolute: " + path.getAbsolutePath());
  }
}
