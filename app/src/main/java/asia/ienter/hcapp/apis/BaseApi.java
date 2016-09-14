package asia.ienter.hcapp.apis;

import asia.ienter.hcapp.utils.Config;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by phamquangmanh on 9/6/16.
 */
public class BaseApi {

    protected String baseApi;
    public BaseApi(String baseData){
         baseApi = Config.BASE_URL  + baseData;
    }
    private Retrofit retrofit = null;

    public Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseApi)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
