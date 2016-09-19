package asia.ienter.hcapp.apis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import asia.ienter.hcapp.utils.Config;
import asia.ienter.hcapp.utils.MLog;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by phamquangmanh on 9/6/16.
 */
public class BaseApi {

    private static final String TAG = "BaseApi";
    protected String baseApi;
    public BaseApi(String baseData){
         baseApi = Config.BASE_URL  + baseData;
    }
    private Retrofit retrofit = null;
    public Retrofit getClient() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if (retrofit==null) {
            MLog.d(TAG,baseApi);
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseApi+"/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
