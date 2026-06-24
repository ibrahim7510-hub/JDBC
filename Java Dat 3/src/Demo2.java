import java.util.HashMap;
import java.util.Map;
public class Demo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Zoro");
        map.put(2, "Ajay");
        map.put(3, "Yusuf");
        map.put(4, "Goku");
        if (map.containsKey(2)) {
            System.out.println("Key 2 is present");
        } else {
            System.out.println("Key 2 is not present");
        }
        System.out.println("\nKey-Value Pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("\nOnly Keys:");
        System.out.println(map.keySet());
    }
}