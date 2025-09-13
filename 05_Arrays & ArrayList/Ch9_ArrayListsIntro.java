import java.util.ArrayList;

public class Ch9_ArrayListsIntro {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(10);

        // ArrayList allows us to add as many elements as we want (unlimited) without defining the size of array or list before.
        // .add function with list is used to add values into the arrayList.

        list.add(345);
        list.add(64);
        list.add(8665);
        list.add(899);
        list.add(47);
        list.add(10);
        list.add(17);
        list.add(645);
        list.add(2);

        System.out.println(list);

        // Other Functions in ArrayList:
        System.out.println(list.contains(420)); // this CHECK if this element is in the ArrayList or not. (returns true or false)
        list.set(1, 69); // this is used to CHANGE an element at a specified index value.
        list.remove(2); // with this function you can REMOVE a function at a particular index.
        System.out.println(list);


    }
}
