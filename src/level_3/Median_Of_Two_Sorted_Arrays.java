package level_3;
//        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.The overall run time complexity should be O(log (m+n)).

public class Median_Of_Two_Sorted_Arrays {
    public double findMedianSorted(int[] nums1, int[] nums2) {
//        We create a new array with length that of the sum of the array lengths
//        We initialize i & j = 0. [i for nums1 & j for nums2]
//        Since the given arrays are already sorted it is easy to compare their elements. We comapre by observing nums1[i] < nums2[j]
//        if the element in nums1 at ithi^{th}i
//                th
//        is less than that of element at jthj^{th}j
//                th
//        index of nums2nums2nums2, we add nums1[i]nums1[i]nums1[i] to new array and increment i; so as to compare the next element of the array to nums2[j].
//        If the opposite case arises, we add nums2[j]nums2[j]nums2[j] to the new array as you can guess. And increment j by 1 for the same reasons we did it with i.
//        Depending on the length of new array, we calculate median.
//        If the length of array is even, median by rule is the average of the 2 middle elements of the array
//        If it is off, it is the middlemost element

        int n1 = nums1.length;
        int n2 = nums2.length;
        int addedNumbers = n1 + n2;
        int[] new_arr = new int[addedNumbers];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (addedNumbers%2==0) return (float)(new_arr[addedNumbers/2-1] + new_arr[addedNumbers/2])/2;
        else return new_arr[addedNumbers/2];
    }
}
