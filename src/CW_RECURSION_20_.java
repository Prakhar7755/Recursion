import java.util.Scanner;

public class CW_RECURSION_20_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    // WRITE A PROGRAM TO CHECK IF THE GIVEN STRING IS PALINDROME OR NOT

        String s = sc.nextLine();
        String rev = rev(s,0);

        if (s.equals(rev))    System.out.println("PALINDROME");

        else                  System.out.println("NOT PALINDROME");


        ///   1:21:00   34


    }

    static String rev (String s, int idx){                                                     // BY USING RECURSION

        // base case
        if (idx==s.length()) return "";
        // recursive call
        String smallAns = rev(s,idx+1);

        return smallAns + s.charAt(idx);
    }


}
