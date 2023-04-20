package Generator;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static Stream<Long> generate(long seed, long a, long c, long m) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = System.currentTimeMillis();

        Stream<Long> randoms = generate(seed, a, c, m);

        randoms.limit(10).forEach(System.out::println);
    }
}
