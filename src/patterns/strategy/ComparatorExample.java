package patterns.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Marius on 07.09.2016.
 */
class LexicographicComparator implements Comparator<String> {
  public int compare(String o1, String o2) {
    return o1.compareTo(o2);
  }
}

class ByLengthComparator implements Comparator<String> {
  public int compare(String o1, String o2) {
    return Integer.compare(o1.length(), o2.length());
  }
}

public class ComparatorExample {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList(
        "watermelon",
        "apple",
        "pear");

    Collections.sort(fruits, new LexicographicComparator());
    // will print [apple, pear, watermelon]
    System.out.println(fruits);

    Collections.sort(fruits, new ByLengthComparator());
    // will print [pear, apple, watermelon]
    System.out.println(fruits);
  }
}
