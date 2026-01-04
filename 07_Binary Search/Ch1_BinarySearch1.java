public class Ch1_BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int target = 15;
        int ans = binraySearch(arr, target);
        System.out.println(ans);
    }

    static int binraySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) { //to confirm if the array is in ascending order (Since order is very important in binary search)
            int mid = start + (end - start) / 2; //Enhanced way to find the mid value
            // int mid = (start + end) / 2;

            if (target < array[mid]) {
                end = mid - 1; // if array is descending: start = mid + 1;
            } else if (target > array[mid]) {
                start = mid + 1; // if array is descending: end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
