// Write a program to check if a number is prime number or not.
public class PrimeChecker {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
