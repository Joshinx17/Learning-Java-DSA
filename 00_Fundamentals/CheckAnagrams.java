//Given two strings, compare if the two of them are anagrams or not.
import java.util.*;
public class CheckAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.next();
        System.out.print("Enter string 2: ");
        String s2 = sc.next();

        System.out.println(isAnagram(s1, s2));
        sc.close();
        
    }
    public static boolean isAnagram(String s1, String s2) {
        char[] s1rr = s1.toCharArray();
        char[] s2rr = s2.toCharArray();

        Arrays.sort(s1rr);
        Arrays.sort(s2rr);

        if(Arrays.equals(s1rr, s2rr)) {
            return true;
        } else {
            return false;
        }

    }
}
