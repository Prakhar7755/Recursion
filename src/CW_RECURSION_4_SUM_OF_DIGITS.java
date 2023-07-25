public class CW_RECURSION_4_SUM_OF_DIGITS {
    public static void main(String[] args) {

                    // GIVEN AN INTEGER, FIND OUT THE SUM OF ITS DIGITS

        // 1. SUB PROBLEM   f(n) = f(n/10) + n % 10
        // 1. self work = n%10
        // 1. base case =

        System.out.println(digitSum(1234));               // 10

        System.out.println(digitSum(12345));              // 15




    }
    static int digitSum(int n){
        if(n/10==0){             // 0 <= n <= 9
            return n;
        }

        // recursive work
        int smallAns = digitSum(n/10);
        int ans = smallAns + n%10;

        return ans;
    }
}
