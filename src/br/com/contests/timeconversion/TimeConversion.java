package br.com.contests.timeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static String testCase() {
        return solve();
    }

    private static String solve() {
        DateFormat inputTimeFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputTimeFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            Date time = inputTimeFormat.parse("07:05:45PM");
            return outputTimeFormat.format(time);
        } catch(ParseException e){
            e.printStackTrace();
        }
        return "bug";
    }
}
