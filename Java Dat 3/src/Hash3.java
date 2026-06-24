import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash3 {
    public static void main(String[] args) {

        Set set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(null);
        set.add(null);
        set.add(true);
        set.add(true);
        set.add(false);
        set.add(false);
        set.add("Zoro");
        set.add("Zoro");
        set.add("J");
        set.add("J");

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}