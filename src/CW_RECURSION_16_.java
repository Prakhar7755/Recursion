public class CW_RECURSION_16_ {
    public static void main(String[] args) {
        //             IMPLEMENT THE IS SORTED ARRAY ALGO. AND RETURN TRUE OR NOT

        int[] a = {10,1,17,4,5};
        System.out.println(isSorted(a,0));
    }
    static boolean isSorted(int[] arr, int idx){
        if(idx <= arr.length){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);

    }
}
                                        // RE WRITE THE PROGRAM