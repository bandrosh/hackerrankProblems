package br.com.contests.countingvalleys;

public class CountingValleys {
    private static int VALLEY = 0;
    private static int MOUNTAIN = 1;
    private static int SEA = 3;

    public static void testCase() {
        int n = 12;
        String s = "DDUUDDUDUUUD";

        System.out.println(countingValleys(n, s));
    }

    private static int getState(int sea) {
        if (sea == 0) return SEA;
        else if (sea < 0) return VALLEY;
        return MOUNTAIN;
    }

    // Complete the countingValleys function below.
    private static int countingValleys(int n, String s) {
        int sea = 0;
        int currState = getState(sea);
        int lastState = currState;

        int valley = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                sea--;
            } else {
                sea++;
            }

            currState = getState(sea);

            if (sea == 0 && currState == SEA && lastState == VALLEY) {
                valley++;
            }

            lastState = getState(sea);
        }

        return valley;
    }
}
