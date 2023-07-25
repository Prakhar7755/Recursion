
public class CW_RECURSION_3_Fibonacci {
    public static void main(String[] args) {
       // PROGRAM TO FIND THE nth FIBONACCI NUMBER   [ F(n) = F(n-1) + F(n-2) is the SUB PROBLEM ]


        //   current term = prev() term + prev(prev) term
        //  N=0 ans 0 , N=1 ans1                  BASE CASE

        System.out.println(fib(1));    // 1
        System.out.println(fib(2));    // 1
        System.out.println(fib(3));    // 2
        System.out.println(fib(4));    // 3
        System.out.println(fib(5));    // 5
        System.out.println(fib(6));    // 8

        System.out.println(fib2(10));   // 55
        System.out.println(fib2(5));    // 5




    }
    // A DETAILED EXPLANATION
    static int fib (int n){
        if (n==0 || n==1){           // BASE CASE
            return n;
        }

        int prev = fib(n-1);      // sub problems
        int prevPrev = fib(n-2);

        int ans = prev+prevPrev;     // final answer

        return ans;
    }

    static int fib2(int n){                                                        // A COMPACT VERSION
        if (n==0 || n==1){
            return n;
        }
        return fib2(n-1)+ fib2(n-2);
    }

}
