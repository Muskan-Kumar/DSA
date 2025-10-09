public class ceiling{
    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //if the target is greater than the greatest number in the array
            if(target > arr[arr.length-1]){
                return -1;
            }
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr, 15));
    }
}