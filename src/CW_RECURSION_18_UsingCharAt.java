import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CW_RECURSION_18_UsingCharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // REMOVE ALL THE OCCURRENCE OF 'a' FORM THE STRING;          abcax   --->  bcx



        String str = "abcax";
        System.out.println(removeA(str,0));               // bcx



        String strk = sc.nextLine();
        System.out.println(removeA(strk,0));                //prakhar = prkhr


    }


    static @NotNull String removeA(String s, int idx){                 // INSTEAD OF A I CAN MAKE THIS METHOD FOR ANY ALPHABET

        // base case
        if (idx==s.length()) return "";

        // recursive call
        String smallAns = removeA(s,idx+1);

        char currChar = s.charAt(idx);

        // self work

        if (currChar!='a') return currChar + smallAns;//  d + bcx

        else return smallAns;

    }




    static void ans(String s){

        for (int i=0; i<s.length(); i++ ){
            String answer = null;
            if (s.charAt(i)!='a'){
                answer+= s.charAt(i);
            }
        }

      //  System.out.println(answer);

    }
}
