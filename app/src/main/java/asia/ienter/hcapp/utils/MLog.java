package asia.ienter.hcapp.utils;

import android.util.Log;

/**
 * Created by phamquangmanh on 9/6/16.
 */
public class MLog {

    public static void d(String tag,String messages){
       if(Config.ISLOG){
           Log.d(tag,messages);
       }
    }

    public static void e(String tag,String messages){
        if(Config.ISLOG){
            Log.e(tag,messages);
        }
    }

}
