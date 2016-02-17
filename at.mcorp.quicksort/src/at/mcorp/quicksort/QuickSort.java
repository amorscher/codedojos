package at.mcorp.quicksort;

/**
 * Class implements the Quick sort algorithm
 * 
 * @author ambros
 *
 */
public class QuickSort<T extends Comparable<T>> {

	private T[] arrayToSort;
	private SortOrder sortOrder;

	public QuickSort(T[] arrayToSortParam) {
		this.arrayToSort = arrayToSortParam;
	}

	public T[] sort(SortOrder order) {
		this.sortOrder = order;
		return sort(0, arrayToSort.length - 1);
	}

	private T[] sort(int indexFrom, int indexTo) {
		// get the pivot element
		int pivotIndex = indexFrom + (indexTo - indexFrom) / 2;
		T pivotElement = arrayToSort[pivotIndex];

		int swapLowIndex = indexFrom;
		int swapHighIndex = indexTo;
		// divide tow lists
		while (swapLowIndex <= swapHighIndex) {

			// search the first element from the left which matches the condition
			while (conditionLeftPart(swapLowIndex,pivotElement)) {
				swapLowIndex++;
			}

			// search the first element form the right which matches the condition
			while (conditionRightPart(swapHighIndex,pivotElement)) {
				swapHighIndex--;
			}

			// check the indices that the high index is not bigger than the low
			// index
			if (swapHighIndex >= swapLowIndex) {
				// do a swap of the elements
				swap(swapLowIndex, swapHighIndex);
				// adapt the indices
				swapHighIndex--;
				swapLowIndex++;
			}

		}
		if (indexFrom < swapHighIndex) {
			// repeat the sort for all the remaining elements on the left
			arrayToSort = sort(indexFrom, swapHighIndex);
		}
		if (indexTo > swapLowIndex) {
			// repeat the sort for all the remaining elements on the right
			arrayToSort = sort(swapLowIndex, indexTo);
		}

		return arrayToSort;
	}

	private boolean conditionLeftPart(int swapIndex, T pivotElement) {	
		return sortOrder==SortOrder.ASCENDING?(arrayToSort[swapIndex].compareTo(pivotElement))<0:(arrayToSort[swapIndex].compareTo(pivotElement))>0;
	}

	private boolean conditionRightPart(int swapIndex, T pivotElement) {
		return sortOrder==SortOrder.ASCENDING?(arrayToSort[swapIndex].compareTo(pivotElement))>0:(arrayToSort[swapIndex].compareTo(pivotElement))<0;
	}
	
	/**
	 * Performs a swap of the elements
	 * 
	 * @param swapLowIndex the element on the right to switchs
	 * @param swapHighIndex the element on the left to switch the
	 */
	private void swap(int swapLowIndex, int swapHighIndex) {
		T temp = arrayToSort[swapLowIndex];
		arrayToSort[swapLowIndex] = arrayToSort[swapHighIndex];
		arrayToSort[swapHighIndex] = temp;
	}

}
