package asia.ienter.hcapp.services;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import asia.ienter.hcapp.apis.UserApi;
import asia.ienter.hcapp.interfaces.IUser;
import asia.ienter.hcapp.models.UserView;
import asia.ienter.hcapp.utils.MLog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by phamquangmanh on 9/14/16.
 */
public class UserService{
    final static  String TAG = "UserService";

    private UserApi userApi = new UserApi();
    public UserService() {
    }
    private void login(String username,String password) {
        Map<String, String> data = new HashMap<>();
        data.put("UserName", username);
        data.put("Password", password);

        final IUser callback = userApi.getClient().create(IUser.class);
        Call<UserView> call = callback.login(data);
        call.enqueue(new Callback<UserView>() {
            @Override
            public void onResponse(Call<UserView> call, Response<UserView> response) {
               UserView userView = response.body();
                callback.onSuccess(userView);
            }

            @Override
            public void onFailure(Call<UserView> call, Throwable t) {
                MLog.e(TAG, t.toString());
            }
        });
    }
}
