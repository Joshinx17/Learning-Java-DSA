// Leetcode Problem: 1295. Find Numbers with Even Number of Digits- https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits_LC {
    public static void main(String[] args) {
        int[] nums = { 555,901,482,1771 };

        System.out.println(findNumbers(nums)); 
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int ele : nums) {
            if (isEven(ele)) {
                count++;
            }
        }
        return count;
    }

    // Method 1: Convert number to string and count its length.
    static boolean isEven(int number) {
        String str = "" + number; // Here we can use digits() function at the bottom and replace this line...
        int len = str.length();  // ...and this line as well
        if (len % 2 == 0) {     // THIS METHOD WILL NOT WORK FOR NEGETIVE NUMBERS.
            return true;
        }
        return false;
    }
    
    // Method 2: to count the digits of a number
    static int digits(int number) {
        if (number < 0) { //Method to deal with negetive numbers in this case.
            number = number * -1;
        }
        int n = number;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10; //Removes last digits.
        }
        return count;
    }
    
    // Method 3(Highly Optimized): To count the number of digits
    static int count(int number) {

        if (number < 0) { //Dealing  with negetive numbers.
            number = number * -1;
        }

        return (int)(Math.log10(number)) + 1; //Main logic of Method 3.
    }
}
