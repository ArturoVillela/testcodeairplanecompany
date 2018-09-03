package charlieandroidblog.esy.es.testcodedelta.Activities;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ListPresenterTest {

    @Mock
    ListView listView = mock(ListView.class);

    @Test
    public void loadData() {
        List<Integer> randomList = new ArrayList<>();
        randomList.add(10);
        randomList.add(1);
        randomList.add(8);
        randomList.add(3);
        randomList.add(6);
        randomList.add(5);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(10);

        assertEquals(expectedList, new ListPresenter(listView).sortNumbers(randomList));
    }
}