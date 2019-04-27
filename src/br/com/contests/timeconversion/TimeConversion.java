package br.com.contests.timeconversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static String testCase() {
        return solve("07:05:45PM");
    }

    public static String solve(String s) {
        DateFormat inputTimeFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputTimeFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            Date time = inputTimeFormat.parse(s);
            String output = outputTimeFormat.format(time);
            return output;
        } catch(ParseException e){
            e.printStackTrace();
        }
        return "bug";
    }
}
