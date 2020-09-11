package br.com.contests;

import br.com.contests.averybigsum.AVeryBigSum;
import br.com.contests.bairesdev.BairesDev;
import br.com.contests.comparethetriplets.CompareTheTriplets;
import br.com.contests.countingvalleys.CountingValleys;
import br.com.contests.jumpingontheclouds.JumpingOnTheClouds;
import br.com.contests.leftrotation.LeftRotation;
import br.com.contests.minimumswap2.MinimumSwap2;
import br.com.contests.newyearchaos.NewYearChaos;
import br.com.contests.plusminus.PlusMinus;
import br.com.contests.repeatedstring.RepeatedString;
import br.com.contests.sockmerchant.SockMerchant;
import br.com.contests.timeconversion.TimeConversion;
import br.com.contests.twodarrayds.TwoDArrayDS;
import br.com.contests.vetextest.VetexTest;

class Main {

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

        /* SOCK MERCHANT */
        System.out.println(SockMerchant.class.getSimpleName());
        SockMerchant.testCase();
        System.out.println();

        /* Counting Valleys */
        System.out.println(CountingValleys.class.getSimpleName());
        CountingValleys.testCase();
        System.out.println();

        /* Jumping on the Clouds */
        System.out.println(JumpingOnTheClouds.class.getSimpleName());
        JumpingOnTheClouds.testCase();
        System.out.println();

        /*Repeated String*/
        System.out.println(RepeatedString.class.getSimpleName());
        RepeatedString.testCase();
        System.out.println();

        /* 2D Array - DS */
        System.out.println(TwoDArrayDS.class.getSimpleName());
        TwoDArrayDS.testCase();
        System.out.println();

        /* Left Rotation */
        System.out.println(LeftRotation.class.getSimpleName());
        LeftRotation.testCase();
        System.out.println();

        /* New Year Chaos */
        System.out.println(NewYearChaos.class.getSimpleName());
        NewYearChaos.testCase();
        System.out.println();

        /* New Year Chaos */
        System.out.println(MinimumSwap2.class.getSimpleName());
        MinimumSwap2.testCase();
        System.out.println();

        /* Test Vetex */
        System.out.println(VetexTest.class.getSimpleName());
        VetexTest.initTest();
        System.out.println();

        /* Test Baires */
        System.out.println(BairesDev.class.getSimpleName());
        BairesDev.initTest();
        System.out.println();
    }
}
