        /* A RECURSION IS A PARAMETER CALLING ITSELF WITH
         - DIFFERENT PARAMETER
         - & A BASE CASE TO TERMINATE THE INFINITE LOOP

         in recursion we solve a bigger problem by solving smaller sub problem as the function calls itself to solve it
        */

                     // return words ENDS THE EXECUTION OF THE METHOD (USE WISELY)


public class CW_RECURSION_0 {
    public static void main(String[] args) {

               //         WRITE A PROGRAM TO PRINT N NATURAL NO. USING RECURSION

//        printIncreasing(5);
//        printIncreasing(1);
        printIncreasing(10);                          //  10 9 8 7 6 5 4 3 2 1


        printInc(10);                                      // BETTER WAY BY MA'AM







    }

                                          // MA'AM METHOD
    static void printInc(int n){              // USING CALL STACK LAST IN FIRST OUT
        if (n==1) {
            // base case or halting condition
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);       // THIS WILL HELP IN PRINTING THIS IN ASCENDING ORDER USNIG STACK

    }
                                 // MY METHOD
    static void printIncreasing(int n){
        if (n==1){
            System.out.println(" "+1);
            return;                     // THIS 'return' WILL END THE PROGrAM WHEN N==1;
        }
        System.out.print(" "+n);
        printIncreasing(n-=1);
        /*
          PI(N) = PI(N-1) N
          PI(5) = PI(4) 5
        */
    }
}
