// public class Smallest_letter{
//     static char smallestChar(char[] letters, char target){
        
//         int start = 0;
//         int end = letters.length-1;
//         while(start <= end){
            
//             int mid = start+(end-start)/2;
//             if(target < letters[mid]){
//                 end = mid-1;
//             }else{
//                 start = mid+1;
//             }
//         }
//         return letters[start %letters.length];
//     }
//     public static void main(String[] args){
//         char[] arr = {'c','f','j'};
//         System.out.println(smallestChar(arr, 'c'));
//     }
// }





public class Smallest_letter{
    static int smallestChar(int[] letters, int target){
        
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            
            int mid = start+(end-start)/2;
            if(target < letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start];
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,6,9,12,15,18,21};
        System.out.println(smallestChar(arr, 16));
    }
}