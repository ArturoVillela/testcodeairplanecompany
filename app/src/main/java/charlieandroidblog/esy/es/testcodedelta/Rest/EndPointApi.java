package charlieandroidblog.esy.es.testcodedelta.Rest;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPointApi {

    //lo que llega del server..
    @GET(RetrofitConstants.URL)
    Call<BeanDatos> getAllDatos();

}
