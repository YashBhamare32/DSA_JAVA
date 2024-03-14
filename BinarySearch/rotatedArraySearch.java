public class rotatedArraySearch{
    public static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        int ans = -1;
        int left = bs(nums , target , 0 , pivot);
        if(left!=-1) return left;
        int right = bs(nums , target , pivot+1 , nums.length-1);
        ans = right;
        return ans;
    }
    public static int pivot(int[] nums){
        int start=0 ; 
        int end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[start]>nums[mid]){
                end = mid-1;
            }
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static int bs(int[] nums , int target , int start , int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4 , 5 , 6 , 7 , 0 , 1 , 2};
        System.out.println(search(nums , 7));
    }
}