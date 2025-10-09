

public class Linear_Search{

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        //____Advance for loop
        
        // for(int i: arr){
        //     if(i == target){
        //         return i;
        //     }
        // }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-4,-5};
        int target = 1;
        System.out.println(linearSearch(arr,target));
    }

}



