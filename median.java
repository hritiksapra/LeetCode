class median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int newArr[] = new int[m + n];
        if ((m + n) % 2 != 0) {
            int mid = (m + n) / 2;
            int leftCount = 0, rightCount = 0, counter = 0;
            while (counter != mid) {
                if (nums1[leftCount] <= nums2[rightCount]) {
                    leftCount++;
                    counter++;
                    if (counter == mid) {
                        System.out.println("The median is "+ ((double) nums1[leftCount]));
                    }
                } else {
                    rightCount++;
                    counter++;
                    if (counter == mid) {
                        System.out.println("The median is "+ ((double) nums2[rightCount]));
                    }
                }
            } 
        }
        else {
            int mid1 = (int) ((m + n) / 2);
            int mid2 = mid1 + 1;
            int sum = 0;
            int leftCount = 0, rightCount = 0, counter = 0;
            while (counter < mid2) {
                if (nums1[leftCount] <= nums2[rightCount]) {
                    leftCount++;
                    counter++;
                    if (counter == mid1 || counter == mid2) {
                        sum += nums1[leftCount];
                    }
                } else {
                    rightCount++;
                    counter++;
                    if (counter == mid1 || counter == mid2) {
                        sum += nums2[rightCount];
                    }
                } 
            }
            double medianed = sum / 2;
           System.out.println("The median is "+ medianed); 
        }
    }
}