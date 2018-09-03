package charlieandroidblog.esy.es.testcodedelta.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import charlieandroidblog.esy.es.testcodedelta.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        init();
    }

    private void init() {
        ListView view = new ListView(this);
        ListPresenter presenter = new ListPresenter(view);
        presenter.initRetrofitCall();
    }
}
