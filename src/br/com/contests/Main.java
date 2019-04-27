package br.com.contests;

import br.com.contests.averybigsum.AVeryBigSum;
import br.com.contests.comparethetriplets.CompareTheTriplets;
import br.com.contests.plusminus.PlusMinus;
import br.com.contests.timeconversion.TimeConversion;

public class Main {

    public static void main(String[] args) {

        /* TIME CONVERSION */
        System.out.println(TimeConversion.class.getSimpleName());
        System.out.println(TimeConversion.testCase());
        System.out.println();

        /* PLUS MINUS */
        System.out.println(PlusMinus.class.getSimpleName());
        PlusMinus.testCase();
        System.out.println();

        /* COMPARE THE TRIPLETS */
        System.out.println(CompareTheTriplets.class.getSimpleName());
        CompareTheTriplets.testCase();
        System.out.println();

        /* A VERY BIG SUM */
        System.out.println(AVeryBigSum.class.getSimpleName());
        AVeryBigSum.testCase();
        System.out.println();
    }
}
