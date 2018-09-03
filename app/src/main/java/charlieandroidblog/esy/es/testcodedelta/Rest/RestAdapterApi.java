package charlieandroidblog.esy.es.testcodedelta.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestAdapterApi {

    public EndPointApi makeRetrofitCall(){

        //esta peticion es solo si el modelo es exactamente igual al del json obtenido del Rest
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RetrofitConstants.ROOT_URL) //la base del rest service
                .addConverterFactory(GsonConverterFactory.create())  //deserializa el json..
                .build();

        return retrofit.create(EndPointApi.class);
    }
}
