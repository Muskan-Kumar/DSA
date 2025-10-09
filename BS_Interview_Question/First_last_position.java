import java.util.Arrays;

public class First_last_position{
    static int[] firstLastPosition(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = Search(nums,target,true);
        if(ans[0] != -1){
            ans[1] = Search(nums,target,false);
        }

        return ans;
    }
    static int Search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if( target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(firstLastPosition(nums, 8)));
    }
}