package Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersAndSorting {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        List<Integer> numbers = new ArrayList<>();
        for (String s : arr) {
            String[] split = s.split(", ");
            for (String num : split) {
                numbers.add(Integer.parseInt(num));
            }
        }
        Collections.sort(numbers);
        StringBuilder Sorting = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            Sorting.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                Sorting.append(", ");
            }
        }
        // виведе  0, 1, 2, 4, 5.
        System.out.println(Sorting);
    }
}
