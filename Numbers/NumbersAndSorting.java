package Numbers;

import java.util.stream.Stream;

public class NumbersAndSorting {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        Stream<Integer> numbers = Stream.of(arr)
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(Integer::parseInt)
                .sorted();
        StringBuilder sorting = new StringBuilder();
        numbers.forEach(num -> {
            sorting.append(num);
            sorting.append(", ");
        });
        if (sorting.length() > 2) {
            sorting.setLength(sorting.length() - 2);
        }
        // виведе 0, 1, 2, 4, 5
        System.out.println(sorting);
    }
}
