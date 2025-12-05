public class q1_OddEven {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
// this works because in binary if the last digit is 1, then its an odd number else its even (if its a 0).
// adding 1 with AND operator returns 1 (true) if its 1 and turns false if its not 1 (ie. 0).
// that last digit is also called Least Significant Bit (LSB).