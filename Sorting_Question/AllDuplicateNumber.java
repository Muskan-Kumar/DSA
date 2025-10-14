// find all duplicate in ana array (Q : 442)

import java.util.*;

public class AllDuplicateNumber{
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(duplicateNumber(arr));
    }
    static List<Integer> duplicateNumber(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    
}