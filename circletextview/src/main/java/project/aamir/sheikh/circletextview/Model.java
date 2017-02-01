package project.aamir.sheikh.circletextview;

import android.content.Context;

/**
 * Created by Aamir on 30-01-2017.
 */

public class Model {

    private static Context context;

    public static Context getContext() {

        return context;
    }

    public static void setContext(Context context) {

        Model.context = context;
    }

}
