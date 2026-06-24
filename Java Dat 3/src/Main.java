import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add("N");
        System.out.println(list);
        list.remove(1);
        list.add(2,"Y");
        list.set(3,"hello");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()+" " +
                    "" +
                    "");
        }


    }
}