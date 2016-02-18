package at.mcorp.sorters;

/**
 * Baseclass for all sorters providing a member variable to store the
 * input/output array.
 * 
 * @author ambros
 *
 * @param <T>
 *            the type of the array values
 */
public abstract class AbstractSorter<T extends Comparable<T>> implements Sorter<T> {

	/**
	 * The array to sort. All modifications will directly apply on this array.
	 */
	protected T[] arrayToSort;
	
	/**
	 * Keeps track of the sorting order
	 */
	protected SortOrder sortOrder;

	/**
	 * Basic constructor
	 * @param arrayToSortParam the array to sort
	 */
	public AbstractSorter(T[] arrayToSortParam) {
		this.arrayToSort = arrayToSortParam;
	}

}
