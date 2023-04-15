package level_2;

public class MergeTwoSortedLists {
    public static int[] mergeTwoSortedArrays(int[] arrayOne, int[] arrayTwo) {
        int[] sortingBothArrays = new int[arrayOne.length + arrayTwo.length];
        int i = 0, j = 0, k = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] < arrayTwo[j]) {
                sortingBothArrays[k++] = arrayOne[i++];
            } else {
                sortingBothArrays[k++] = arrayTwo[j++];
            }
        }
        while (i < arrayOne.length) {
            sortingBothArrays[k++] = arrayOne[i++];
        }
        while (j < arrayTwo.length) {
            sortingBothArrays[k++] = arrayTwo[j++];
        }
        return sortingBothArrays;
    }
}
