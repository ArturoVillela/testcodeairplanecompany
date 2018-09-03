package charlieandroidblog.esy.es.testcodedelta.Activities.RecycleView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import charlieandroidblog.esy.es.testcodedelta.R;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    List<Integer> lNumbers;

    public RecycleViewAdapter(List<Integer> lNumbers) {
        this.lNumbers = lNumbers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creamos una nueva vista
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // - obtenemos un elemento del dataset según su posición
        // - reemplazamos el contenido de los views según tales datos
        String name = lNumbers.get(position).toString();
        holder.tvNumber.setText(name);
    }

    @Override
    public int getItemCount() {
        return lNumbers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        //Si solamente es un titulo.
        public TextView tvNumber;

        public ViewHolder(View view) {
            super(view);

            tvNumber = (TextView) view.findViewById(R.id.tv_number);
        }
    }
}
