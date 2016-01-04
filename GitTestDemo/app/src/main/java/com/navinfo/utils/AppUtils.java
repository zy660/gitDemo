package com.navinfo.utils;

public class AppUtils {

    public static final String activity_result0 = "0";
    public static final String activity_result1 = "1";
    public static final String activity_result2 = "2";
    public static final String activity_result3 = "3";
    public static final String activity_result4 = "4";

    public static boolean isEmpty(String txt){
        boolean result = false;
        if (txt != null || !"".equals(txt)){
            result = true;
        }
        return result;
    }
}
