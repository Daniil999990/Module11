package Numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumbersAndSorting {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String result = Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        // виведе 0, 1, 2, 4, 5
        System.out.println(result);
    }
}