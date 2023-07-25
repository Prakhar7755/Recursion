public class CW_RECURSION_12_ELEMENTS_SUM {
    public static void main(String[] args) {

        // FIND THE SUM OF TH ELEMENTS OF THE ARRAY[2,3,5,20,1]
        int[] arr = {2,3,5,20,1};
        System.out.println(elementSum(arr,0));

        int[] ark= {1,2,3,4};
        System.out.println(elementSum(ark,0));



    }
    static int elementSum(int[] arr, int idx){

        if (idx == arr.length){
            return 0;
        }

        // sub problem
        int smallAns = elementSum(arr,idx+1);

        int ans = arr[idx] + smallAns ;


        return ans;
    }
}
