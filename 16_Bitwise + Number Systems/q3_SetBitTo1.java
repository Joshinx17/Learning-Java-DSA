//Given any binary number and any ith bit of it, replace it with 1 if its 0 and will remain 1 if its already 1.
public class q3_SetBitTo1 {
    public static void main(String[] args) {
        int n = 1001000;
        int b = 4;
        System.out.println(iBit(n,b));
    }
    public static int iBit(int n, int b) {
        return n | (1 << (b-1)); //OR Operator (?)
    }
}
