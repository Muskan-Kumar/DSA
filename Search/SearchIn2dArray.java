import java.util.Arrays;

// public class SearchIn2dArray{

//     static boolean Search(int[][] arr, int target){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
        
//     }

//     public static void main(String[] args){
//         int [][] arr= {
//             {1,2,3,4},
//             {5,6,7,8,9},
//             {10,11,12,13}
//         };
//         System.out.println(Search(arr,6));
//     }
// }





public class SearchIn2dArray{

    static int[] Search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
        
    }

    //find a max value in 2d array
    static int Max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for(int[] i:arr){
            for(int j: i){
                if(j>max){
                    max=j;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int [][] arr= {
            {1,2,3,4},
            {5,6,7,8,9},
            {10,11,12,13}
        };
        int ans[]=Search(arr,8);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
    }
}