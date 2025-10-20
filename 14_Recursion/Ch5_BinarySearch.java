public class Ch5_BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}




// * Formula (recurrence relation) : F(N) = O(1) + F(N/2)
// N = size of array for binary search

// ? TYPES OF RECURRENCE RELATIONS :
// 1. Linear recurrence relation eg. Finbonacci
// 2. Divide & Conquer recurrence relation eg. Binary Search (Where the answer
// is getting divided by a factor.[here: n/2])