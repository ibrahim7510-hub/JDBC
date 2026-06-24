import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Zoro");
        map.put(2,"Ajay");
        map.put(3,"Yusuf");
        map.put(4,"Goku");
        map.remove(2);
        map.replace(1,"Zoro");

        System.out.println(map.entrySet());
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getValue()+"->"+entry.getKey());
        }
        System.out.println(map.keySet());
        System.out.println(map);
    }
}
