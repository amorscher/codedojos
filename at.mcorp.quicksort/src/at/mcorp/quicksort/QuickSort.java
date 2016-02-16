package at.mcorp.quicksort;

/**
 * Class implements the Quick sort algorithm
 * 
 * @author ambros
 *
 */
public class QuickSort {

	private int[] arrayToSort;
	private SortOrder sortOrder;
//ajdkashdksahdk
	public QuickSort(int[] arrayToSortParam) {
		this.arrayToSort = arrayToSortParam;
	}

	public int[] sort(SortOrder order) {
		this.sortOrder = order;
		return sort(0, arrayToSort.length - 1);
	}

	private int[] sort(int indexFrom, int indexTo) {
		// get the pivot element
		int pivotIndex = indexFrom + (indexTo - indexFrom) / 2;
		int pivotElement = arrayToSort[pivotIndex];

		int swapLowIndex = indexFrom;
		int swapHighIndex = indexTo;
		// divide tow lists
		while (swapLowIndex <= swapHighIndex) {

			// search the first element which is not smaller which matches the condition
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
				// continue with the higher index
				swapHighIndex--;
				swapLowIndex++;
			}

		}
		if (indexFrom < swapHighIndex) {
			// repeat the sort for all the remaining elements on the rights
			arrayToSort = sort(indexFrom, swapHighIndex);
		}
		if (indexTo > swapLowIndex) {
			// repeat the sort for all the remaining elements on the right
			arrayToSort = sort(swapLowIndex, indexTo);
		}

		return arrayToSort;
	}

	private boolean conditionLeftPart(int swapIndex, int pivotElement) {	
		return sortOrder==SortOrder.ASCENDING?(arrayToSort[swapIndex] < pivotElement):(arrayToSort[swapIndex] > pivotElement);
	}

	private boolean conditionRightPart(int swapIndex, int pivotElement) {
		return sortOrder==SortOrder.ASCENDING?(arrayToSort[swapIndex] > pivotElement):(arrayToSort[swapIndex] < pivotElement);
	}
	
	/**
	 * Performs a swap of the elements
	 * 
	 * @param swapLowIndex the element on the right to switchs
	 * @param swapHighIndex the element on the left to switch the
	 */
	private void swap(int swapLowIndex, int swapHighIndex) {
		int temp = arrayToSort[swapLowIndex];
		arrayToSort[swapLowIndex] = arrayToSort[swapHighIndex];
		arrayToSort[swapHighIndex] = temp;
	}

}
