public class agnosticSearch {
    public static int agnostic(int[] nums , int target){
        int start=0;
        int end = nums.length-1;

        //find whether ascending or descending
        boolean isAsc = nums[start]<nums[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target) return mid;

            if(isAsc){
                if(target<nums[mid]){
                    //search in left subarray
                    end = mid-1;
                }else{
                    //search in right subarray
                    start = mid+1;
                }
            }else{
                if(target>nums[mid]){
                    //search in left subarray
                    end = mid-1;
                }else{
                    //search in right subarray
                    start = mid+1;
                }
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = {-10,-9,-8,5,50,100,245,249};
        int[] arr = {500,450,390,24,10,3,-3,-4,-5,-6,-10};
        System.out.println(agnostic(arr, -5));
    }
}
