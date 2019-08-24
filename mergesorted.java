//Runtime: 11 ms, faster than 10.91% of Java online submissions for Merge Sorted Array.
//Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Merge Sorted Array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr = (m + n - 1);
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[curr] = nums1[i];
                i--;
                curr--;
            } else {
                nums1[curr] = nums2[j];
                j--;
                curr--;
            }
            System.out.println(nums1[curr + 1]);
        }
        while (i >= 0) {
            nums1[curr] = nums1[i];
            i--;
            curr--;
        }
        while (j >= 0) {
            nums1[curr] = nums2[j];
            j--;
            curr--;
        }
    }
}