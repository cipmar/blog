package patterns.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Marius on 11.09.2016.
 */
public class CollectorExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c");

    String s1 = list.stream().collect(Collectors.joining(","));
    System.out.println(s1); // will print a,b,c

    Long s2 = list.stream().collect(Collectors.counting());
    System.out.println(s2); // will print 3
  }
}
