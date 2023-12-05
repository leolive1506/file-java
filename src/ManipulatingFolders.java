import java.io.File;
import java.util.Scanner;

public class ManipulatingFolders {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a folder path: ");
    String strPath = sc.nextLine();

    // Tipo File pode ser tanto caminho de um arquivo como uma pasta 
    File path = new File(strPath);

    // vetor contendo cada diretorio / pasta
    File[] folders = path.listFiles(File::isDirectory);
    System.out.println("FOLDERS");
    for (File folder: folders) {
      System.out.println(folder);
    }

    System.out.println();
    System.out.println("FILES");
    File[] files = path.listFiles(File::isFile);
    for (File file: files) {
      System.out.println(file);
    }

    // criando subpasta
    boolean success = new File(strPath + "/nova-pasta" ).mkdir();
    System.out.println("Diretorio criado com sucesso: " + success);
    sc.close();
  }
}
