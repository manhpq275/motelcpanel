package asia.ienter.hcapp.apis;

import asia.ienter.hcapp.models.UserView;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by phamquangmanh on 9/13/16.
 */
public interface ApiInterface {
    @GET("movie/top_rated")
    Call<UserView> getTopRatedMovies(@Query("api_key") String apiKey);
}
