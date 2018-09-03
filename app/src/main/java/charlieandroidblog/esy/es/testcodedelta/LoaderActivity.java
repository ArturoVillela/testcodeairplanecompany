package charlieandroidblog.esy.es.testcodedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import charlieandroidblog.esy.es.testcodedelta.Activities.ListActivity;
import charlieandroidblog.esy.es.testcodedelta.Activities.ListContract;

public class LoaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchNextActivity();
    }

    private void launchNextActivity() {
        startActivity(new Intent(LoaderActivity.this, ListActivity.class));
    }
}
