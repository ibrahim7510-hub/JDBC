import java.util.HashSet;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(3));
        System.out.println(set.add(3));
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set.add(true));
        System.out.println(set.add(true));
        System.out.println(set.add(false));
        System.out.println(set.add(false));
        System.out.println(set.add("Zoro"));
        System.out.println(set.add("Zoro"));
        System.out.println(set.add("J"));
        System.out.println(set.add("J"));
    }
}
