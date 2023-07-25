
public class CW_RECURSION_7_Alternate_Sum {
    public static void main(String[] args) {

        //  1-2+3-4+5-6+7.......n
    /*
        *   f(n) = f(n-1) + n,    n is odd
        *   f(n) = f(n-1) - n,    n is even
        *   0 when n=0
    */

        System.out.println(alternateSum(10));       // -5



    }
    static int alternateSum(int n){
        if(n==0){
            return 0;
        }
        else if (n % 2 == 1){
            return alternateSum(n-1) + n;
        }
        else {
            return alternateSum(n-1) - n;
        }
    }
}
