package patterns.strategy;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Marius on 17.09.2016.
 */
public class FileFilterExample {
  public static void main(String[] args) {
    File file = new File("c:/");
    File[] files;

    files = file.listFiles(path -> path.getName().endsWith(".txt"));
    printFiles(files, "txt files:");

    files = file.listFiles(path -> path.getName().endsWith(".xml"));
    printFiles(files, "xml files:");
  }

  private static void printFiles(File[] files, String title) {
    System.out.println(title);
    Arrays.stream(files)
        .map(file -> file.getName())
        .forEach(System.out::println);
  }
}
