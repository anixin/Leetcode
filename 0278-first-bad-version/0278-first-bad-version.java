/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0; int end = n;

        while(start <= end) {
            int mid = start - (start - end)/2;
            if(isBadVersion(mid)) {
                if(!isBadVersion(mid-1))
                    return mid;
                end = mid - 1;
            }   else {
                start = mid + 1;
            }
        }
        return -1;
    }
}