package Name;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameSorting {

    public static String getOddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Mary", "Eva", "Roma", "Max", "Danny", "Igor", "Slava");
        String result = getOddIndexedNames(names);
        // виведе 2. Peter, 4. Eva, 6. Max, 8. Igor
        System.out.println(result);
    }

}
