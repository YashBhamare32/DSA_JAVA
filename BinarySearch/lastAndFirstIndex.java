public class lastAndFirstIndex {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int left = bs(nums , target , true);
        int right = bs(nums , target , false);
        ans[0]=left;
        ans[1] = right;
        return ans;
    }
    public int bs(int[] nums , int target , boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                ans =  mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
