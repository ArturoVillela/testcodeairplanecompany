package charlieandroidblog.esy.es.testcodedelta.Activities;

import android.util.Log;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import charlieandroidblog.esy.es.testcodedelta.Rest.BeanDatos;
import charlieandroidblog.esy.es.testcodedelta.Rest.EndPointApi;
import charlieandroidblog.esy.es.testcodedelta.Rest.RestAdapterApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListPresenter implements ListContract.Presenter {

    private final String TAG = ListPresenter.class.getSimpleName();
    ListContract.View view;


    public ListPresenter(ListView view) {
        this.view = view;
    }

    public void initRetrofitCall(){
        loadData();
    }

    @Override
    public void loadData() {
        EndPointApi endPointApi = new RestAdapterApi().makeRetrofitCall();
        Call<BeanDatos> contacto = endPointApi.getAllDatos();

        contacto.enqueue(new Callback<BeanDatos>() {
            @Override
            public void onResponse(Call<BeanDatos> call, Response<BeanDatos> response) {
                List<Integer> listOrdered = sortNumbers(response.body().getData());
                view.initRecycleView(listOrdered);
                Log.d(TAG, "onResponse: ");
            }

            @Override
            public void onFailure(Call<BeanDatos> call, Throwable t) {
                //todo.. add logic to retry the call or show the error msg.
                Log.d(TAG, "onFailure:  ");
            }
        });

        Log.d("zzz", "tryRetrofit: echo..");
    }

    public List<Integer> sortNumbers(List<Integer> lData) {

        Collections.sort(lData, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue()-o2.intValue();
            }
        });

        return lData;

    }

}
