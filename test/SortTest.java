import com.fuge.Sort;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dongfu on 17-7-10.
 */
public class SortTest {
    @Test
    public void quickSortTest() throws Exception {
        Integer[] array = {49,38,65,97,76,13,27,49};
        Integer[] result = {13,27,38,49,49,65,76,97};
        Sort<Integer> sort = new Sort<>();
        sort.quickSort(array);
        for (int i = 0; i < array.length; i++) {
            Assert.assertEquals(result[i], array[i]);
        }
    }

}