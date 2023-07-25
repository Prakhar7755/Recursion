
public class CW_RECURSION_14_ReturnTheIndex {

    public static void main(String[] args) {



        int[] arr = {1,8,9,7,9,8,5};


        tellIndex(arr,9,0);                    // index = 2 and 4




    }
    static void tellIndex(int[] a, int target, int idx){           // this will tell the index

        // base case
        if (idx >= a.length) return;

        // self work
        if (a[idx]== target) {System.out.println(idx);}

        // recursive call
        tellIndex(a, target, idx + 1);

    }
}
