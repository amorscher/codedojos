package at.mcorp.sorters.insertionsort;

import at.mcorp.sorters.AbstractSorter;
import at.mcorp.sorters.SortOrder;
import at.mcorp.sorters.utils.SorterUtils;

/**
 * Implements the insertion algorithm
 * 
 * @author ambros
 *
 * @param <T>
 *            the type of the array values
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorter<T> {

	public InsertionSort(T[] arrayToSortParam) {
		super(arrayToSortParam);
	}

	@Override
	public T[] sort(SortOrder order) {
		this.sortOrder = order;
		// start from one in order to be able to compare to the left
		for (int i = 1; i < arrayToSort.length; i++) {
			int insertionIndex = i;
			while (insertionIndex > 0) {
				if (needsSwap(arrayToSort[insertionIndex - 1], arrayToSort[insertionIndex])) {
					SorterUtils.swap(arrayToSort,insertionIndex - 1, insertionIndex);
				}
				insertionIndex--;
			}
		}
		return arrayToSort;
	}

	/**
	 * Returns true or false if a swap is needed according to the
	 * {@link AbstractSorter#sortOrder}
	 * 
	 * @param object1 the first object
	 * @param object2 the second object
	 * @return true or false whether a swap is needed
	 */
	private boolean needsSwap(T object1, T object2) {
		return sortOrder == SortOrder.ASCENDING ? object1.compareTo(object2) > 0 : object1.compareTo(object2) < 0;
	}
}
