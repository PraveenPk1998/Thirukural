package com.praveen.thirukural;

public class GlobalVar {

    private static String str, pageName;

    public static String getPageName() {
        return pageName;
    }

    public static void setPageName(String pageName) {
        GlobalVar.pageName = pageName;
    }

    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        GlobalVar.str = str;
    }
}
