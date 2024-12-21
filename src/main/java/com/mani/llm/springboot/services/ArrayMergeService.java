public class ArrayMergeService {

    /**
     * Merges two sorted arrays into a single sorted array.
     * 
     * @param array1 the first sorted array
     * @param array2 the second sorted array
     * @return the merged sorted array
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[index++] = array1[i++];
            } else {
                mergedArray[index++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[index++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[index++] = array2[j++];
        }

        return mergedArray;
    }

}