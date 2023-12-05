import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Ex {
  private static final String path = "../src.csv";
  private static final String OUT = "/out";
  private static final String OUT_FILENAME = "/summary.csv";

  List<Product> products = new ArrayList<>();

  public void main() {

    try (BufferedReader file = new BufferedReader(new FileReader(path))) {
      String line = file.readLine();

      while (line != null) {
        String[] productVetor = line.split(",");
        Product product = new Product(productVetor[0], (Double.parseDouble(productVetor[1])), (Integer.parseInt(productVetor[2])));
        products.add(product);

        line = file.readLine();
      }

      writeProdutFile();
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private void writeProdutFile() throws IOException {
    // creating new directory
    String directory = new File(path).getParent() + OUT;
    createDirectory(directory);
    
    BufferedWriter bw = new BufferedWriter(new FileWriter(directory + OUT_FILENAME));
    for (Product product: products) {
      bw.write(product.getName() + "," + product.getTotal());
      bw.newLine();
    }

    bw.close();
  }

  private boolean createDirectory(String directory) {
    return new File(directory).mkdir();
  }
}
