import java.util.HashSet;

public class Hash2 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }

        System.out.println("HashSet Elements: " + set);
    }
}