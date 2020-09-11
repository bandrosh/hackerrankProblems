package br.com.contests.bairesdev;

public class BairesDev {
    public static void initTest() {
        int c = 904;
        int count = 0;

        for (c = 904; c >= 1; c--) {
            if (c % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
