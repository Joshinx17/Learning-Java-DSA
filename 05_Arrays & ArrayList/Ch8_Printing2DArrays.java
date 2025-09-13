public class Ch8_Printing2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };


        //Printing using classic java loop method
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
