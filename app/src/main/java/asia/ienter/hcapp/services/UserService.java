package asia.ienter.hcapp.services;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import asia.ienter.hcapp.apis.UserApi;
import asia.ienter.hcapp.interfaces.IUser;
import asia.ienter.hcapp.models.UserView;
import asia.ienter.hcapp.utils.Config;
import asia.ienter.hcapp.utils.MLog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by phamquangmanh on 9/14/16.
 */
public class UserService{
    final static  String TAG = "UserService";


    public UserService() {
    }
    public void login(String username,String password,final IUser callback) {
        Map<String, String> data = new HashMap<>();
        data.put("username", username);
        data.put("password", password);
        data.put("token", Config.APP_TOKEN);

        Call<UserView> call = callback.login(data);
        call.enqueue(new Callback<UserView>() {
            @Override
            public void onResponse(Call<UserView> call, Response<UserView> response) {

                MLog.d(TAG,response.body().getUserToken());
                //UserView userView = response.body();
                //callback.onSuccess(userView);
            }
            @Override
            public void onFailure(Call<UserView> call, Throwable t) {
                MLog.e(TAG, t.toString());
            }
        });
    }
}
