package br.com.contests.newyearchaos;

public class NewYearChaos {
    public static void testCase() {
        int t = 3;

        int[] n = new int[t];
        n[0] = n[1] = n[2] = 8;


        String[] s = new String[t];
        s[0] = "5 1 2 3 7 8 6 4";
        s[1] = "1 2 5 3 7 8 6 4";
        s[2] = "1 2 5 3 4 7 8 6";

        for (int tItr = 0; tItr < t; tItr++) {
            int[] q = new int[n[tItr]];

            String[] qItems = s[tItr].split(" ");

            for (int i = 0; i < n[tItr]; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int ans = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Integer.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) ans++;
        }
        System.out.println(ans);
    }
}
