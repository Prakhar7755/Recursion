public class CW_RECURSION_10_PrintArray {
    public static void main(String[] args) {

                                       // PRINT THE ARRAY RECURSIVELY

        int [] arr = {5,4,2,3};


/* 1 */        printArrayMe(arr,3);       // WORKS FINE BY ME


        int[] ark = {1,2,3,4,5};


/* 2 */        printArrayPw(ark,0);             // WORKS FINE

    }
    static void printArrayPw(int[] arr, int idx){
        // base case
        if (idx == arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);   // printing arr[0] FIRST THEN THE RECURSE

        // recursive work
        printArrayPw(arr,idx + 1);
    }
    static void printArrayMe(int[] arr, int currentIndex){
        //  BASE CASE
        if (currentIndex==0){
            System.out.println(arr[currentIndex]);
            return;
        }
        // RECURSIVE CALL (print the lower index first)
        printArrayMe(arr,currentIndex-1);

        // FINAL ANSWER (print the last element at last)
        System.out.println(arr[currentIndex]);
    }
}
