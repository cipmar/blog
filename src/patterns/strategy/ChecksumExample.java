package patterns.strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/**
 * Created by Marius on 17.09.2016.
 */
public class ChecksumExample {

  public static void main(String[] args) throws IOException {
    File f = new File("c:/file.txt");

    try (CheckedInputStream cis = new CheckedInputStream(
        new FileInputStream(f), new CRC32())) {
      readFile(cis);
      System.out.println(cis.getChecksum().getValue());
    }

    try (CheckedInputStream cis = new CheckedInputStream(
        new FileInputStream(f), new Adler32())) {
      readFile(cis);
      System.out.println(cis.getChecksum().getValue());
    }
  }

  static void readFile(InputStream is) throws IOException {
    byte[] buffer = new byte[1024];
    // we just need to read the file to compute the checksum
    while (is.read(buffer) >= 0) ;
  }
}
