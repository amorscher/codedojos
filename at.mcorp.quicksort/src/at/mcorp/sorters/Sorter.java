package at.mcorp.sorters;

/**
 * Common interface for all sorters providing a sort method taking an order
 * attribute. All sorters have to full-fill this contract.
 * 
 * @author ambros
 *
 * @param <T> the type of the elements
 */
public interface Sorter<T extends Comparable<T>> {
	/**
	 * Performs the sorting of the array
	 * @param order determines how the array should be ordered
	 * @return the ordered array h
	 */
	public T[] sort(SortOrder order);
}
