package dayproblems.arrays;

import java.util.*;

public class FindTheLosersOfTheCircularGame {

    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        System.out.println(Arrays.toString(circularGameLosers(n, k)));
    }

    public static int[] circularGameLosers(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        Set<Integer> set = new HashSet<>();
        int current = 1;
        int cycle = 1;
        set.add(current);
        do {
            current = (k * cycle + current) % n;
            if (current == 0) {
                current = n;
            }
            cycle++;
        }
        while (set.add(current));
        list.removeAll(set);
        return list.stream().mapToInt(value -> value).toArray();
    }
}