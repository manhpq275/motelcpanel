package asia.ienter.hcapp.apis;

import asia.ienter.hcapp.utils.Config;

/**
 * Created by phamquangmanh on 9/6/16.
 */
public class BaseApi {

    private String baseApi;
    public BaseApi(String baseData){
         baseApi = Config.BASE_URL  + baseData;
    }

    public String getBaseUrl(){
        return baseApi;
    }

}
