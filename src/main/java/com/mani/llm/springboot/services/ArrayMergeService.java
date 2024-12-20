public class ArrayMergeService {

    /**
     * Merges two sorted arrays into a single sorted array.
     * 
     * @param array1 the first sorted array
     * @param array2 the second sorted array
     * @return the merged sorted array
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[0];
        for (int value : array1) {
            mergedArray = appendElement(mergedArray, value);
        }
        for (int value : array2) {
            mergedArray = appendElement(mergedArray, value);
        }
        return mergedArray;
    }

    /**
     * Appends an element to an array.
     * 
     * @param array the original array
     * @param element the element to append
     * @return the new array with the element appended
     */
    private static int[] appendElement(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}