
public class CW_RECURSION_13_SearchForAnElement {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7443,8,5};

                         // SEARCH FOR AN ELEMENT IN THE ARRAY. AND RETURN TRUE IF FOUND ELSE FALSE

        int target = 8;

        System.out.println(search(arr,46,0));          // false

        System.out.println(search(arr,8,0));           // true

        System.out.println(linearSearch(arr,2,0));     // true (my edited answer)


    }
    static boolean search(int[] a, int target, int idx){

        // base case
        if (idx >= a.length) return false;

        // self work
        if (a[idx]== target) return true;

        // recursive call
        return search(a, target, idx + 1);  // tell true if correct
    }
    static boolean linearSearch(int[] arr, int target, int idx){          // MY EDITED ANSWER

        if (idx==arr.length){
            return false;
        }
        if (arr[idx]==target){
            return true;
        }

       return linearSearch(arr,target,idx+1);             // can write this as      if ( linearSearch( arr, target, idx+1) == true) return true ;
    }
}
