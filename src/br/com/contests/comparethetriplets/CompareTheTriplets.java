package br.com.contests.comparethetriplets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    public static void testCase(){
        String entAllice = "17 28 30";
        String entBoB = "99 16 8";

        List<Integer> ali = Stream.of(entAllice.split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> bob = Stream.of(entBoB.split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(solve(ali, bob).toString());
    }

    private static List<Integer> solve(List<Integer> a, List<Integer> b) {
        int size = a.size();
        List<Integer> resp = Arrays.asList(0, 0);

        for(int i = 0; i < size; i++) {
            if(a.get(i) > b.get(i)) {
                resp.set(0, resp.get(0) + 1);
            } else if(a.get(i) < b.get(i)){
                resp.set(1, resp.get(1) + 1);
            }
        }

        return resp;
    }

}
