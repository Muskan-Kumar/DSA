public class BinarySearch{
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //if found the element then return index of an element
                return mid;
            }
        }
        //it means element not found 
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        System.out.println(binarySearch(arr, 8));
    }
}
