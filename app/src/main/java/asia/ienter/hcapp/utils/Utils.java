package asia.ienter.hcapp.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by phamquangmanh on 9/6/16.
 */
public class Utils {
    public static boolean hasInternet(Activity activity){
        ConnectivityManager cm = (ConnectivityManager) activity.getSystemService(activity.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if(netInfo !=null && netInfo.isConnectedOrConnecting()){
            return true;
        }else {
            return false;
        }
    }

    public static void setAppAuthorization(Context context,String authorization){
        SharedPreferences.Editor editor = context.getSharedPreferences("Authorization", Context.MODE_PRIVATE).edit();
        editor.putString("Authorization", authorization);
        editor.commit();
    }

    public static String getAuthorization(Context context){
        SharedPreferences prefs = context.getSharedPreferences("Authorization", Context.MODE_PRIVATE);
        String resutl = prefs.getString("Authorization", "");
        return resutl;
    }
}
