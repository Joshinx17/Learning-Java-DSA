//Order agnostic binary search: When you dont know if the array is in ascending or descending order.
public class Ch2_AscDscBS {
    public static void main(String[] args) {
        int[] arrA = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arrD = { 7, 6, 5, 4, 3, 2, 1 };

        int target = 5;

        System.out.println("Ascending: " + binarySearch(arrA, target)); 
        System.out.println("Descending: " + binarySearch(arrD, target)); 
    }

    static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        boolean isAscending = array[start] <= array[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
