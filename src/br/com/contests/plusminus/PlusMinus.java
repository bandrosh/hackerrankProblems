package br.com.contests.plusminus;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PlusMinus {

    public static void testCase(){
        int n = 6;
        String ent = new String("-4 3 -9 0 4 1");

        String[] arrItems = ent.split(" ");

        double [] arr = new double[3];
        int pos = 0;
        int neg = 0;
        int zeroes = 0;

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            if(arrItem > 0){ pos++; }
            else if(arrItem < 0){ neg++; }
            else { zeroes++; }
        }

        arr[0] = (double) pos/n; arr[1] = (double) neg/n; arr[2] = (double) zeroes/n;

        plusMinus(arr, 3);
    }

    static void plusMinus(double [] arr, int n) {
        NumberFormat numberFormat = new DecimalFormat("#0.000000");
        for(int i = 0; i < n; i++) {
            System.out.println(numberFormat.format(arr[i]).replace(",", "."));
        }

    }
}
