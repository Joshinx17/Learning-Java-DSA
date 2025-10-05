//Apply binary search on this array and find the target element.

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8 };
        int target = 6;

        System.out.println("Your target element is at position: "+ binarySearch(arr, target));
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
