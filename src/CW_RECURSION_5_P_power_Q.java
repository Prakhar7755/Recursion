public class CW_RECURSION_5_P_power_Q {
    public static void main(String[] args) {

        // ENTER 2 NUMBERS P AND Q, FIND THE VALUE OF P^Q
        // f(p,q) = p * f(p,q) when q>0
        // BASE CASE if q=0; then return 1


        System.out.println(pow(2,10));                // 1024 CORRECT

        System.out.println(pow2(2,9));                // 512  CORRECT

        System.out.println(power(4,3));                // 64 CORRECT

    }
     static int pow(int p, int q ){
        if (q==0){
            return 1;   // I made a mistake here by returning 0 earlier
        }
        return p*pow(p,q-1);
    }
    static int pow2(int p, int q ){
        if (q==0){
            return 1;  // I made a mistake here by returning 0 earlier
        }
        int ans = p*pow2(p,q-1);
        return ans;
    }
    static int power(int p, int q){
        int pow = 1;
        while (q>0){
            pow *= p ;
            q -- ;
        }
        return pow;
    }
}
