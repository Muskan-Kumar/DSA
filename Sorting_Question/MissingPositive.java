// find the missing positive in an array   (Q : 41)

public class MissingPositive{
    public static void main(String[] args){
        int[] arr = {3,4,-1,1};
        System.out.println(missingPositive(arr));
    }
    static int missingPositive(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}