//Search if a given character(letter) is in the string(word) or not.
public class SearchInString {
    public static void main(String[] args) {
        String str = "Kevin";
        char target = 'V';
        System.out.println(isMyLetterHere(str, target));
    }

    public static boolean isMyLetterHere(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    } 
}    