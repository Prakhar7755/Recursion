import java.util.Scanner;

public class CW_RECURSION_1_N_to_1 {
    public static void main(String[] args) {

        // THE RECURSION SPELL

        // 1 IDENTIFY THE SMALLER PROBLEM -> LET RECURSION SOLVE
        // 2 SELF WORK - DO YOUR WORK (1,2,3,4) here 5 is the work
        // 3 IDENTIFY THE BASE CASE -> smallest problem for which the answer  is obvious

        // NOTE -

        /*   WRITE A PROGRAM TO PRINT ALL NATURAL NO. FROM N TO 1 USING RECURSION   */

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDecreasing(n);             // WORKS FINE
    }
    static void printDecreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

}
/*
                                 SYNTAX
methodName ( N parameter )
{
          if(halt condition){
             return result;
          }
          return methodName(N parameter)
}
*/