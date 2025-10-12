// Find in Mountain Array

public class Mountain_Array{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(mountainArray(arr, 3));
    }

    static int mountainArray(int[] arr, int target){
        int peak = peakElement(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}