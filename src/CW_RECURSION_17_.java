import java.util.Scanner;

public class CW_RECURSION_17_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     // String s = sc.next();        // Razor sharp ---> Razor    (next() returns the first string)
        String s = sc.nextLine();
        System.out.println(s);


               // char name = name.charAt(int index);

        char ch = s.charAt(0);     // PRINTS THE FIRST CHARACTER IN THE STRING
        System.out.println(ch);

        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();



                          //            name.substring( int startIdx, int endIdx )

        System.out.println(s.substring(3));

    }
}
