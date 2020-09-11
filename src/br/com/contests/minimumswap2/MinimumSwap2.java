package br.com.contests.minimumswap2;

public class MinimumSwap2 {
    public static void testCase() {
        int t = 1;

        int[] n = new int[t];
        n[0] = 7;


        String[] s = new String[t];
        s[0] = "1 3 5 2 4 6 7";

        for (int tItr = 0; tItr < t; tItr++) {
            int[] q = new int[n[tItr]];

            String[] qItems = s[tItr].split(" ");

            for (int i = 0; i < n[tItr]; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            System.out.println(minimumSwaps(q));
        }
    }

    static int minimumSwaps(int[] arr) {

        return 0;
    }
}
