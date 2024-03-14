public class badVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
        
            if (!isBadVersion(mid)) {
                // Eliminate the lower half
                if(isBadVersion(mid+1)){
                    return mid+1;
                }
                left = mid + 1;
            } else {
                // Eliminate the upper half
                right = mid - 1;
            }
        }

        // Otherwise, element not present
        return -1;



    }
}
    public static void main(String[] args) {
        
    }
}
