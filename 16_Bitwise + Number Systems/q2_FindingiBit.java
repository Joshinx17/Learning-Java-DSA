// Finding out which bit is at which position.
// * THIS SOLUTION IS WRONG- FIND OUT THE RIGHT SOLUTION !!!
public class q2_FindingiBit {
    public static void main(String[] args) {
        int n = 1001000;
        int b = 4;
        System.out.println(iBit(n,b));
    }
    public static int iBit(int n, int b) {
        return n & (1 << (b-1));
    }
}