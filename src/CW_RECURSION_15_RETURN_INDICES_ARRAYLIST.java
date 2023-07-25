import java.util.ArrayList;

public class CW_RECURSION_15_RETURN_INDICES_ARRAYLIST {
    public static void main(String[] args) {

        int[] arr ={1,2,4,4,5,4};
        int target =4;
        ArrayList<Integer> ans = allIndices(arr,target,0);

                                  // Printing the arrraylist
        ans.toString();
        for (int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));             // WORKS FINE { 2, 3, 5 }
        }

    }
    static ArrayList<Integer> allIndices(int[] a, int target, int idx){ // 4,2,4,4

        // base case
        if (idx>=a.length){
            return new ArrayList<Integer>();   // return empty arraylist as no target element
        }
        ArrayList<Integer> ans = new ArrayList<>();

        // self work
        if (a[idx]==target){
            ans.add(idx);                    // { 0 }
        }

        // recursive call
        ArrayList<Integer> smallAns = allIndices(a,target,idx+1);     // { 1 , 3 }

        // FINAL ANS
        ans.addAll(smallAns);   // { 0, 1, 3 }
        return ans;
    }
}
