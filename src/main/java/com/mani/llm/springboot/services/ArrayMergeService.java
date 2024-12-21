public class ArrayMergeService {

    /**
     * Merges two sorted arrays into a single sorted array.
     * 
     * @param array1 the first sorted array to merge
     * @param array2 the second sorted array to merge
     * @return a single sorted array containing all elements from array1 and array2
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
     * Appends an element to the end of an array.
     * 
     * @param array the array to which the element will be appended
     * @param element the element to append
     * @return a new array with the element appended
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