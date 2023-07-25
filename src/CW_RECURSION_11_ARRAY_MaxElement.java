public class CW_RECURSION_11_ARRAY_MaxElement {
    public static void main(String[] args) {

        int[] arr = {3, 10, 3, 2, 5};               // PRINT THE MAX ELEMENT

        max(arr);                                  // brute force works

       /*
          big problem = f(arr, idx)

          recursive call/ small problem = f(arr, idx + 1)

          small ans , arr[idx]

          base case =
       */
        int[] ark = {1, 2, 5, 2, 6, 4};

        System.out.println(maxPW(ark,0));         // WORKS FINE




    }




    static int maxPW(int[] arr, int idx){
        // base case
        if (idx ==arr.length-1){
            return arr[idx];
        }
        // small problem-> idx+1
        int smallAns = maxPW(arr, idx+1);

        // self work and final ans
       return Math.max(arr[idx], smallAns);

    }




    static void max(int[] arr){             // BRUTE FORCE WORKS FINE
        int max = 0;
        for (int i=0; i< arr.length; i++){
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
    }
}
