public class Ch3_PrettyPrinting {
    public static void main(String[] args) {
        float a = 435.165437f; // Now print this number to only 2 decimal places.
        System.out.printf("New formatted nummber is: %.2f \n", a);
        System.out.println(Math.PI);
        System.out.printf("Value of pi: %.5f", Math.PI);
    }
}
