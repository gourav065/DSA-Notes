import java.util.*;
import java.util.stream.Collectors;

public class CountDuplicates {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2, 5, 6, 8, 2, 8, 3);

        Map<Integer, Long> map =
                list1.stream()
                     .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        map.entrySet()
           .stream()
           .filter(e -> e.getValue() > 1)
           .forEach(System.out::println);
    }
}
