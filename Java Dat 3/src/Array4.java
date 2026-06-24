import java.util.ArrayList;
import java.util.Iterator;

public class Array4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        Iterator<Integer> itr = list.iterator();
        int count = 0;
        while (itr.hasNext()) {
            int num = itr.next();
            if (count % 2 == 0) {
                System.out.println(num);
            }
            count++;
        }
    }
}