/*
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 *  representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 *  To accommodate this, nums1 has a length of m + n,
 *  where the first m elements denote the elements that should be merged, 
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSorted {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // my solution

        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else
                nums3[k++] = nums2[j++];
        }
        while (i < m)
            nums3[k++] = nums1[i++];
        while (j < n)
            nums3[k++] = nums2[j++];
        for (i = 0; i < nums3.length; i++)
            nums1[i] = nums3[i];

        // AI solution
        /*
         * int i = m - 1, j = n - 1, k = m + n - 1;
         * while (i >= 0 && j >= 0) {
         * if (nums1[i] > nums2[j]) {
         * nums1[k--] = nums1[i--];
         * } else {
         * nums1[k--] = nums2[j--];
         * }
         * }
         * while (j >= 0) {
         * nums1[k--] = nums2[j--];
         * }
         */
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 0, 0, 0 };
        int[] arr2 = { 2, 4, 6, };
        merge(arr1, 3, arr2, 3);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
