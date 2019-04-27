package br.com.contests.jumpingontheclouds;

public class JumpingOnTheClouds {
    public static void testCase() {
        int n = 6;
        int[] c = new int[n];
        String[] cItems = "0 0 0 0 1 0".split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println(jumpingOnClouds(c));
    }

    private static boolean tryJump(int currentPosition, int[] v) {
        if (currentPosition + 1 >= v.length) return false;
        if (v[currentPosition + 1] == 0 && currentPosition + 2 < v.length && v[currentPosition + 2] == 0) return true;
        return v[currentPosition + 1] == 1;
    }

    // Complete the jumpingOnClouds function below.
    private static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length; ) {
            if (tryJump(i, c)) {
                i += 2;
            } else {
                i++;
            }

            if (i < c.length)
                jumps++;
        }

        return jumps;
    }
}
