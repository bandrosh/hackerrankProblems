package br.com.contests.repeatedstring;

public class RepeatedString {
    public static void testCase() {
        String s = "a";
        long n = 1000000000000L;

        System.out.println(repeatedString(s, n));
    }

    private static long lettersCount(String s, long n) {
        long count = 0L;
        for (int i = 0; i < n; i++) if (s.charAt(i) == 'a') count++;
        return count;
    }

    // Complete the repeatedString function below.
    private static long repeatedString(String s, long n) {
        long mod = n % s.length();
        long numbersOfTimes = n / s.length();
        return lettersCount(s, s.length()) * numbersOfTimes + lettersCount(s, mod);
    }
}
