//Conduct a linear search in an array but for a specfic range within the array.
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28, 5 };
        int target = 5;
        System.out.println(findInRange(arr, target, 1, 4));
    }

    static int findInRange(int[] array, int target, int start, int end) { //Note: Both start & End are index values
        for (int i = start; i <= end; i++) {
            if (target == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
