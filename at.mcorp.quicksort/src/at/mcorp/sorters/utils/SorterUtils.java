/**
 * 
 */
package at.mcorp.sorters.utils;

/**
 * @author ambros
 * Utility class providing static functions
 */
public final class SorterUtils {

	private SorterUtils() {
		// just offering static functions
	}

	/**
	 * Performs a swap of the elements
	 * 
	 * @param array the array to swap values
	 * @param index1 the element on the left to switch
	 * @param index2 the element on the right to switch
	 */
	public static <T extends Comparable<T>> void swap(T[] array, int index1, int index2) {
		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
}
