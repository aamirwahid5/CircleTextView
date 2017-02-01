package project.aamir.sheikh.circletextview;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Random;

/**
 * Created by Aamir on 31-01-2017.
 */

public class Utils {
    static int randomAndroidColor;
    static int color = -1;
    private static int[] androidColors = Model.getContext().getResources().getIntArray(R.array.androidcolors);

    //Generate Random Color
    public static String genRandomColor() {
        randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        String hexColor = "#" + Integer.toHexString(randomAndroidColor).substring(2);
        return hexColor.toString();
    }

    //Save Circle Color in Shared Prefs
    public static void setCircleColor(int position, int color) {
        SharedPreferences preferences;
        SharedPreferences.Editor editor;
        preferences = Model.getContext().getSharedPreferences("colors", Context.MODE_PRIVATE);
        editor = preferences.edit().putInt(Integer.toString(position), color);
        editor.commit();
    }

    //Retrieve Circle Color from Shared Prefs
    public static int LoadCircleColor(int position) {
        SharedPreferences preferences = Model.getContext().getSharedPreferences("colors", Context.MODE_PRIVATE);
        color = preferences.getInt(Integer.toString(position), -1);
        return color;
    }
}
