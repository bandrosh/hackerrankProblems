package br.com.contests.averybigsum;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
    public static void testCase(){
        List<String> ent = Arrays.asList("1000000001 1000000002 1000000003 1000000004 1000000005".split(" "));
        System.out.println(aVeryBigSum(ent));
    }

    // Complete the aVeryBigSum function below.
    private static String aVeryBigSum(List<String> ar) {
        BigInteger bigInteger = new BigInteger("0");

        for (String anAr : ar) {
            bigInteger = bigInteger.add(BigInteger.valueOf(Long.parseLong(anAr)));
        }

        return bigInteger.toString();
    }
}
