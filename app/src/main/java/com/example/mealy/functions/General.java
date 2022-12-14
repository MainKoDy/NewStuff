package com.example.mealy.functions;

import android.content.Context;

public class General {
    public static int dpToPx(int dp, Context context) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }

    public static String blankIfVoid(String string) {
        String emptyString;
        return Validate.IsEmpty(string) ? "" : string;
    }

}
