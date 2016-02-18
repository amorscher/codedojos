package at.mcorp.sorters.mergesort;

import java.util.Arrays;

import at.mcorp.sorters.AbstractSorter;
import at.mcorp.sorters.SortOrder;

/**
 * Implements the merge sort algorithm
 * 
 * @author ambros
 *
 * @param <T>
 *            the type of the array values
 */
public class MergeSort<T extends Comparable<T>> extends AbstractSorter<T> {

	public MergeSort(T[] arrayToSortParam) {
		super(arrayToSortParam);
	}

	public T[] sort(SortOrder order) {
		this.sortOrder = order;
		return sort(0, arrayToSort.length - 1);
	}

	private T[] sort(int indexFrom, int indexTo) {
		
		int length = indexTo - indexFrom;
		int splitIndex = indexFrom + (length) / 2;
		
		//till only one element is available
		if (length > 1) {
			//split again the arrays
			sort(indexFrom, splitIndex);
			sort(splitIndex, indexTo);
			//afterwards sort the sub-arrays
			sortSubArrays(indexFrom, indexTo, splitIndex);
		}
		return arrayToSort;
	}

	/**
	 * Sorts the sub arrays by splitting them and doing a compare
	 * 
	 * @param indexFrom
	 *            start index of the sub-array
	 * @param indexTo
	 *            end index of the sub-array
	 * @param splitIndex
	 *            the index to split the array
	 */
	private void sortSubArrays(int indexFrom, int indexTo, int splitIndex) {

		// split into two arrays
		T[] left = createLeftSubArray(indexFrom, splitIndex);
		T[] right = createRightSubArray(splitIndex, indexTo);

		int leftIndex = 0;
		int rightIndex = 0;
		int index = indexFrom;
		// compare the two arrays to each other
		while (index < indexTo) {
			while (leftIndex < left.length || rightIndex < right.length) {
				if (leftIndex < left.length && rightIndex < right.length) {
					if (leftElementWins(left[leftIndex], right[rightIndex])) {
						arrayToSort[index] = left[leftIndex];
						leftIndex++;
						index++;
					} else {
						arrayToSort[index] = right[rightIndex];
						rightIndex++;
						index++;
					}
				} else if (leftIndex == left.length) {
					arrayToSort[index] = right[rightIndex];
					rightIndex++;
					index++;

				} else if (rightIndex == right.length) {
					arrayToSort[index] = left[leftIndex];
					leftIndex++;
					index++;
				}

			}

		}

	}

	/**
	 * Returns whether the left element has to be taken as the next element
	 * 
	 * @param leftElement
	 *            the left element
	 * @param rightElement
	 *            the right element
	 * @return true false
	 */
	private boolean leftElementWins(T leftElement, T rightElement) {
		return sortOrder == SortOrder.ASCENDING ? leftElement.compareTo(rightElement) < 0
				: leftElement.compareTo(rightElement) > 0;
	}

	/**
	 * Creates the left sub array
	 * 
	 * @param indexFrom
	 *            start index of the sub
	 * @param indexTo
	 *            low index of the sub
	 * @return the created sub-array as a separate instance
	 */
	private T[] createLeftSubArray(int indexFrom, int indexTo) {
		// create a copy
		return Arrays.copyOfRange(arrayToSort, indexFrom, indexTo);
	}

	/**
	 * Creates the right sub array
	 * 
	 * @param indexFrom
	 *            start index of the sub
	 * @param indexTo
	 *            low index of the sub
	 * @return the created sub-array as a separate instance
	 */
	private T[] createRightSubArray(int indexFrom, int indexTo) {
		// if it is the last index enter a specific case as the last element
		// also has to be considered
		if (indexTo == arrayToSort.length - 1) {
			indexTo = arrayToSort.length;
			// if there are two last elements left sort them first
			if (indexTo - indexFrom == 2) {
				sortSubArrays(indexFrom, indexTo, indexTo - 1);
			}
		}
		return Arrays.copyOfRange(arrayToSort, indexFrom, indexTo);
	}
}
