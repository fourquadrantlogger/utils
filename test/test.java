import com.github.timeloveboy.utils.Log;
import com.github.timeloveboy.utils.Ring;

/**
 * Created by root on 17-6-17.
 */
public class test {
    public static void main(String[] args) {
        Integer[] s = new Integer[]{1, 3, 4, 5, 6, 7, 8, 9};
        Ring<Integer> r = new Ring(s);
        Log.v(r);
    }
}
