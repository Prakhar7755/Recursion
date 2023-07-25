public class CW_RECURSION_6_Print_Multiples {

    static int kMultiples(int n, int k){
        if (k==1){          // HERE I MADE A MISTAKE BY TAKING n==0, which was printing 0 as O/P as well
            return n;
        }
        System.out.println(kMultiples(n,k-1)); // recursive call

        // System.out.println(n*k);
        return n*k;
    }


    static void printMultiples(int n, int k){
        if (k==0){       // base case                 if I remove the k=0 with1 then I can do the same
            // System.out.println(n);  FOR BASE CASE n==1
            return;
        }
        // recursive call
        printMultiples(n,k-1);

        //self work
        System.out.println(n*k);

    }



    public static void main(String[] args) {

        // GIVEN A NUMBER num AND A VALUE k. PRINT K MULTIPLES OF num

        // f(n,k) = prints first k multiples of n;
        // SMALL PROBLEM = f(n,k-1)
        // SELF WORK = PRINT(N*K)
        // BASE CASE = EXIT WHEN k=1 OR K=0


        System.out.println(kMultiples(12,5));              // WORKS FINE

        printMultiples(5,5);                               // WORKS FINE MA'AM KA ANSWER
    }

}
