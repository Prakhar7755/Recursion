
public class CW_RECURSION_9_Euclid_s_Algorithm {

    public static void main(String[] args) {

        System.out.println(gcd(66, 99));              // 33

    }

    static int gcd(int x, int y){
        if (y==0){
            return x;
        }

        return gcd(y,x%y);
    }
}


//          LCM * GCD = X * Y