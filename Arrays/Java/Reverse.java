public class Reverse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        revArray(arr);

        for (int i = 0; i <= arr.length-1; i++) {

            System.out.print(arr[i]+", ");
        }
    }

    public static void revArray(int arr[]) {
        int start = 0;
        int end = arr.length -1; //arrayName.length is a function to print the length of the array.

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        

            start++;
            end--;                              

        }
    }
    
    
}   

