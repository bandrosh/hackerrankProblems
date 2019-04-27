package br.com.contests.sockmerchant;

public class SockMerchant {

    public static void testCase() {
        int n = 9;
        String ent = "10 20 20 10 10 30 50 10 20";

        int[] ar = new int[n];

        String[] arItems = ent.split(" ");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        System.out.println(sockMerchant(n, ar));
    }

    private static int sockMerchant(int n, int[] ar) {
        int[] table = new int[101];
        for (int i = 0; i < n; i++) table[ar[i]]++;

        int solution = 0;
        for (int i = 0; i < 101; i++) solution += table[i] / 2;

        return solution;
    }
}
