import java.util.ArrayList;
import java.util.List;

public class Laptop2 {
    public static void main(String[]args){
        List<Laptop> list=new ArrayList<>();
        Laptop hp=new Laptop("Victus", 16, 670000);
        Laptop lenevo=new Laptop("Ideapad", 8, 620000);
        Laptop Dell=new Laptop("Victus", 32, 540000);
        list.add(hp);
        list.add(lenevo);
        list.add(Dell);
        System.out.println(list);

        list.sort(null);
        System.out.println(list);
    }
}
