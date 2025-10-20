public class Ch4_Febonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
    public static int fibo(int n) {
        if(n < 2) {  // base condition
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}




// When you write recursive function in a formula, its called recurrance relation.

// ? How to understand and approch a recursion problem ?
//* 1. Identify if you can breakdown problem into smaller problems.
//* 2. Write the recurrence relation if needed.
//* 3. Draw the recursive tree.
//* 4. About the tree:
// * (i) See the flow of funtions, how they are getting in stack.
// * (ii) Identify and focus on left tree calls and right three calls.
// * (iii) Draw the tree and pointer again and again using pen and paper.
// * (iv) Use a debugger to see the flow.
//* 5. See how values are returned and their types (int, string etc.) at each step. See where the function call will come out of and in the end you'll come out of the main funtion. 