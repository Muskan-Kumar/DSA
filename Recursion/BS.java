
public class BS{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,56,66,78};
        System.out.println(search(arr, 66, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}