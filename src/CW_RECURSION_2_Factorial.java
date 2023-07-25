public class CW_RECURSION_2_Factorial {
    public static void main(String[] args) {

                                 // FIND THE FACTORIAL OF A GIVEN NUMBER

        System.out.println(factorial(5));   // 120

        System.out.println(facto(5));       // 120

        System.out.println(fib3(5));       // 120


    }
    static int factorial(int n){
        // base case
        if (n==0) return 1;
        // recursive work for smaller problem AND TRUST
        int smallAns = factorial(n-1);   // Call 4! =24
        // self work for final answer
        int ans = n * smallAns;  // n * factorial(n-1)
        return ans;
    }
    static int facto(int n){                                              // SECOND WAY TO WRITE SYNTAX
        if (n==0) return 1;
        return n*factorial(n-1);
    }
    static int fib3(int n){
        int fact=1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
}