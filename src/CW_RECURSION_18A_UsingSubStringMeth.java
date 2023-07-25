public class CW_RECURSION_18A_UsingSubStringMeth {
    public static void main(String[] args) {


        String str = "abcax";

        System.out.println(removeA(str));               // bcx


    }
    static String removeA(String s){
        if (s.length()==0) return " ";

        String smallAns = removeA(s.substring(1));

        char currChar = s.charAt(0);

        // self work

        if (currChar!='a') return currChar + smallAns;//  d + bcx

        else return smallAns;
    }
}
