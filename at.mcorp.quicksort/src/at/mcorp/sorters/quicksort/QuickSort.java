package at.mcorp.sorters.quicksort;

import at.mcorp.sorters.AbstractSorter;
import at.mcorp.sorters.SortOrder;
import at.mcorp.sorters.utils.SorterUtils;

/**
 * Implements the quick sort algorithm
 * @author ambros
 *
 * @param <T> the type of the array values
 */
public class QuickSort<T extends Comparable<T>> extends AbstractSorter<T> {

	public QuickSort(T[] arrayToSortParam) {
		super(arrayToSortParam);
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
			while (leftValueOK(swapLowIndex,pivotElement)) {
				swapLowIndex++;
			}

			// search the first element form the right which matches the condition
			while (rightValueOK(swapHighIndex,pivotElement)) {
				swapHighIndex--;
			}

			// check the indices that the high index is not bigger than the low
			// index
			if (swapHighIndex >= swapLowIndex) {
				// do a swap of the elements
				SorterUtils.swap(arrayToSort,swapLowIndex, swapHighIndex);
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

	private boolean leftValueOK(int leftIndex, T pivotElement) {	
		return sortOrder==SortOrder.ASCENDING?(arrayToSort[leftIndex].compareTo(pivotElement))<0:(arrayToSort[leftIndex].compareTo(pivotElement))>0;
	}

	private boolean rightValueOK(int rightIndex, T pivotElement) {
		return sortOrder==SortOrder.ASCENDING?(arrayToSort[rightIndex].compareTo(pivotElement))>0:(arrayToSort[rightIndex].compareTo(pivotElement))<0;
	}
}
