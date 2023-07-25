public class CW_RECURSION_19 {
    public static void main(String[] args) {

        System.out.println(reverse("Prakhar"));         // rahkarP

        System.out.println(rev("Netflix",0));      //  xilfteN

        System.out.println(rev("प्रसिद्धि",0));         // िध्दिसर्प


    }


    static String rev (String s, int idx){                                                     // BY USING RECURSION

        if (idx==s.length()) return "";

        String smallAns = rev(s,idx+1);

        return smallAns + s.charAt(idx);
    }



    static String reverse(String s){                                                            // BY USING LOOPS
        String n = "";
        for (int i=s.length()-1; i>=0; i--){
            n += s.charAt(i);
        }
        return n;
    }
}
