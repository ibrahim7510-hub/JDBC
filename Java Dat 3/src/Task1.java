import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListIterator<Integer> itr=list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}
