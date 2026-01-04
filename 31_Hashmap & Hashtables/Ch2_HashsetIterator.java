import java.util.HashSet;
import java.util.Iterator;

public class Ch2_HashsetIterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("Size of set is: " + set.size());
        System.out.println(set);

        //Iterator = Traversal in Sets
        Iterator<Integer> it = set.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
