public class Ch5_Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // Explicit type casting 
            series = series + ch; // series += ch; 
        }
        System.out.println(series); // This will print the series of characters from 'a' to 'z' in a single line
    }
}

// ! Debugging the above code to see whats happening inside: 
// ? Series = "" + 'a' = "a"
// ? Series = "a" + 'b' = "ab"
// ? Series = "ab" + 'c' = "abc"
// ? Series = "abc" + 'd' = "abcd"
// ? Series = "abcd" + 'e' = "abcde" ...
// * This will have the time comeplexity of O(n^2) because in each iteration, a new string is created by concatenating the previous string with the new character. This is inefficient for large strings as it involves copying the entire string each time.

// =============================================================
//                 ANOTHER CODE TO PRINT THE SERIES
// =============================================================

// public static void main(String[] args) {
//     String series = "";
//     for (int i = 0; i < 26; i++) {
//         char ch = (char) ('a' + i); // Explicit type casting 
//          System.out.println(series); // This will print the series of characters from 'a' to 'z' one after other below it.
//     }
// }