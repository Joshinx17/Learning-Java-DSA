import java.util.HashSet;

public class Ch1_HashsetIntro {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert [Syntax: list.add(element)]
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size of Set
        System.out.println("Size of set is: " + set.size());

        //Print all elements in the set
        System.out.println(set);

        //Searching - contains
        if(set.contains(1)) {
            System.out.println("This set contains 1");
        }
        if(!set.contains(6)) {
            System.out.println("Does not contain 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("does not contain 1 (or 1 has been deleted.)");
        }
    }
}

