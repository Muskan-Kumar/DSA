// find the missing number in array (Q: )

public class MissingNumber{
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
        System.out.println(searching(nums));
    }
    static int missingNumber(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }


    // from leetcode answer (100% beat)
    static int searching(int[]arr){
        int n=arr.length;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for(int i:arr){
            actualSum+=i;
        }
        return expectedSum-actualSum;
    }
}