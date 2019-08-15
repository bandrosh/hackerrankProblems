package br.com.contests.HackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void testCase() {
        int n = 5;
        List<Integer> arr = Arrays.asList(1, 2, 3);
        int elm = 5;
        System.out.println(findNumber(arr, elm));


        int l = 2; int r = 5;
        System.out.println(oddNumbers(2, 5));
    }

    // Complete the findNumber function below.
    private static String findNumber(List<Integer> arr, int k) {
        return arr.contains(k) ? "YES": "NO";
    }

    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> solution = new ArrayList<>();
        for(int i = l; i <=r; i++) {
            if(i%2 == 1) solution.add(i);
        }

        return solution;
    }
}
