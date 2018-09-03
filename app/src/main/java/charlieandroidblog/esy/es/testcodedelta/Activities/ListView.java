package charlieandroidblog.esy.es.testcodedelta.Activities;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import charlieandroidblog.esy.es.testcodedelta.Activities.RecycleView.BeanRecycleViewElements;
import charlieandroidblog.esy.es.testcodedelta.Activities.RecycleView.RecycleViewAdapter;
import charlieandroidblog.esy.es.testcodedelta.R;

public class ListView implements ListContract.View {

    Activity context;

    public ListView(ListActivity context) {
        this.context = context;
    }


    @Override
    public void initRecycleView(List<Integer> lNumbers) {
        Log.d("zzz", "initRecycleView: ");
        RecyclerView recyclerView = (RecyclerView) context.findViewById(R.id.recycleViewNumbers);

        //RecyclerView can perform several optimizations if it can know in advance that changes in
        //adapter content cannot change the size of the RecyclerView itself.
        recyclerView.setHasFixedSize(true);

        //Definimos que tipo de layout manager utilizará el RecycleView
        LinearLayoutManager linearLayout = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayout);

        //inicializamos el adapter con un dataSet  (datos a mostrar), y le pasamos la referencia al adapter
        //El constructor de RecycleViewAdapter no esta creado en este momento, hay que hacerlo.
        RecycleViewAdapter adapter = new RecycleViewAdapter(lNumbers);
        recyclerView.setAdapter(adapter);

    }
}
