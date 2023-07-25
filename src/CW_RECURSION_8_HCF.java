public class CW_RECURSION_8_HCF {
    public static void main(String[] args) {

        // Greatest common divisor GCD OR HCF

        hcf2(12, 16);             // brute force approach works
        hcf2(99, 66);

        System.out.println(hcf1(12,16));          // again it worked




    }
    static int hcf1(int x, int y){                           // BRUTE FORCE by long division
             while(x%y!=0){
                 int remainder = x % y;
                 x = y;
                 y = remainder;
             }
             return y;
    }


    static int hcf2(int p, int q) {                           // BRUTE FORCE by loops
        if (q < p) {
            for (int i = q; i > 0; i--) {
                if (p % i == 0 && q % i == 0) {
                    System.out.println(i);
                    return i;
                }
            }
        }
        else{
            for (int i = p; i > 0; i--) {
                if (p % i == 0 && q % i == 0) {
                    System.out.println(i);
                    return i;
                }
            }
        }
        return 0;
    }
}
