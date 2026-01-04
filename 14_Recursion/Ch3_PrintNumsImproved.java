public class Ch3_PrintNumsImproved {
    public static void main(String[] args) {
        
    }
    static void print(int n) {
        if (n==5) { // Base Condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1); // tail recurssion 
    }
}
// Therefore, a recursion is a function that calls itself. 
// ? What is a base condition?
// ? Base condition in recursion is a condition where our recursion will stop making new calls. Without base condition the function will keep calling itself and stack memory will keep getting filled again and again, consuming the memory of the computer, causing an error called 'stack-overflow'. 
// * What is recursion tree?