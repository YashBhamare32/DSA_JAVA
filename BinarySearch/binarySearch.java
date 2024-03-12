import java.util.*;
public class binarySearch {
    public static int binary(int[] nums , int target){
        // //sorting logic here
        // for(int i=0 ; i<nums.length ; i++){
        //     int min_idx=0;
        // }



        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid]){
                //search in right subarray
                start = mid+1;
            }else if(target<nums[mid]){
                //search in left subarray
                end = mid-1;
            }else{
                return mid;
            }
        }  
        return -1;      
    }
    public static void main(String[] args) {
        int[] arr = {-18 , -12,-10,-2,10,100,200,245,300};
        System.out.println(binary(arr, -12));
    }
}
