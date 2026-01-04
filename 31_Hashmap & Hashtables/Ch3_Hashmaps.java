import java.util.HashMap;
public class Ch3_Hashmaps {
  public static void main(String[] args) {
    
    // Empty HashMap with default capacity
    HashMap<String, Integer> map1 = new HashMap<>();

    // HashMap with initial capacity
    HashMap<String, Integer> map2 = new HashMap<>(20);

    // HashMap with initial capacity and load factor
    HashMap<String, Integer> map3 = new HashMap<>(20, 0.75f);

    // HashMap from another map
    HashMap<String, Integer> map4 = new HashMap<>(map2);

  }  
}
