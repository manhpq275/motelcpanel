package asia.ienter.hcapp.interfaces;

import java.util.Map;

import asia.ienter.hcapp.models.UserView;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by phamquangmanh on 9/14/16.
 */
public interface IUser {
    @GET("login")
    Call<UserView> login(@QueryMap Map<String, String> options);

    void onSuccess(UserView userView);
    void onError();
}
