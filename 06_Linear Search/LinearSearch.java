//Write the program to enter the index value and it shall return the element at that position
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 1, 3, 5, 7, };

        int ans = findElement(arr, 3);
        System.out.println(ans);

    }

    public static int findElement(int[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                return array[i];
            }
        }
        return -1; 
    }
}
