package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndUppercase {

    public static List<String> sortAndUppercase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Mary", "Eva", "Roma", "Max", "Danny", "Igor", "Slava");
        List<String> result = sortAndUppercase(names);
        // виведе [SLAVA, ROMA, PETER, MAX, MARY, IVAN, IGOR, EVA, DANNY]
        System.out.println(result);
    }

}
