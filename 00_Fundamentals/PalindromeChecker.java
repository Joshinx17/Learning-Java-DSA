// Checking if a number and a string are palindrome or not (both done seperately).
public class PalindromeChecker {
    public static void main(String[] args) {
        int num = 1225;
        String str = "madam";
        System.out.println(isNumberPalindrome(num));
        System.out.println(isStringPalindrome(str));
    }

    public static boolean isNumberPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10; //number = number / 10
        }
        return reverse == original;
    }

    public static boolean isStringPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;
        
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
