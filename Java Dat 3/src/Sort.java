import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        int a[] = {23,45,88};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String b[] = {"Hi","Bro","Coffee"};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(98);
        list.add(123);
        list.sort(null);
        Collections.sort(list);
        System.out.println(list);

    }
}
