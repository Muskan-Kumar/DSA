public class Search_In_Range{

    static boolean linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return false;
        }

        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 7;
        System.out.println(linearSearch(arr, target, 1, 8));
    }
}