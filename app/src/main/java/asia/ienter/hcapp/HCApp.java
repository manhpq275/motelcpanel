package asia.ienter.hcapp;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

import asia.ienter.hcapp.utils.Config;
import asia.ienter.hcapp.utils.MLog;

/**
 * Created by phamquangmanh on 9/6/16.
 */

public class HCApp extends Application {

    private static HCApp sInstance;
    private static String TAG = "HCApp";

    private HashMap<String, Typeface> fontMap = new HashMap<String, Typeface>();
    public static Typeface typeface;
    public static Typeface typefaceHome;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        typeface = getFont(Config.FONTS);
        typefaceHome = getFont(Config.FONTS_HOME);
    }

    public static HCApp getInstance(){
        return sInstance;
    }

    public Typeface getFont(String font) {
        Typeface typeface = fontMap.get(font);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(getResources().getAssets(), "fonts/" + font);
                fontMap.put(font, typeface);
            } catch (Exception e) {
                MLog.e(TAG, " Font Factory Could not get typeface: " + e.getMessage() + " with name: " + font);
                return null;
            }

        }
        return typeface;
    }

}
