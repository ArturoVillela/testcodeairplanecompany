package charlieandroidblog.esy.es.testcodedelta.Activities;

import java.util.List;

public interface ListContract {

    interface Presenter{

        void loadData();
    }


    interface View{

        void initRecycleView(List<Integer> lNumbers);
    }

}
