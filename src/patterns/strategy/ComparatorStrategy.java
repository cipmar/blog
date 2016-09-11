package patterns.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Marius on 07.09.2016.
 */
public class ComparatorStrategy {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "orange", "watermelon", "pear");

        Collections.sort(items, new LexicographicComparator());
        System.out.println(items);
        Collections.sort(items, new ByLengthComparator());
        System.out.println(items);
    }

    static class LexicographicComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }

    static class ByLengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }
}
