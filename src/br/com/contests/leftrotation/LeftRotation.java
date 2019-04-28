package br.com.contests.leftrotation;

import java.util.Arrays;

public class LeftRotation {
    public static void testCase() {
        String ent = "1 2 3 4 5";
        String[] nd = ent.split(" ");

        int n = 5;
        int d = 1;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(nd[i]);
            a[i] = aItem;
        }

        System.out.println(Arrays.toString(rotLeft(a, d)));
    }

    // Complete the rotLeft function below.
    private static int[] rotLeft(int[] a, int d) {
        int[] solution = new int[a.length];

        for (int i = 0, j = (a.length - d + i) % a.length; i < a.length; i++) {
            solution[j] = a[i];

            j++;
            j = j % a.length;
        }

        return solution;
    }
}
