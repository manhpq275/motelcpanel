package asia.ienter.hcapp.apis;

import java.util.Map;

import asia.ienter.hcapp.models.UserView;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by phamquangmanh on 9/14/16.
 */
public class UserApi extends BaseApi {

    public UserApi() {
        super("user/");
    }


}
