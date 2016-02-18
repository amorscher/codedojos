package at.corp.sorters;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;

import at.mcorp.sorters.SortOrder;
import at.mcorp.sorters.Sorter;

public abstract class TheoriesBasedSorterTest extends AbstractSorterTest {

	@Theory
	public void sortAscendingTest(Integer val1, Integer val2, Integer val3, Integer val4, Integer val5) {
		// given
		// array of data to sort
		Integer[] arrayToSort = new Integer[] { val1, val2, val3, val4, val5 };
		Integer[] arrayToSortRef = new Integer[] { val1, val2, val3, val4, val5 };
		// sort the arrayToSortRef by the jdk default sorting implementation
		Arrays.sort(arrayToSortRef);

		// when
		// do the quick sort
		Sorter<Integer> sort = createSorter(arrayToSort);
		Integer[] sortedArray = sort.sort(SortOrder.ASCENDING);

		// then
		assertArrayEquals(arrayToSortRef, sortedArray);
	}

	@Theory
	public void sortDedcendingTest(Integer val1, Integer val2, Integer val3, Integer val4, Integer val5) {
		// given
		// array of data to sort
		Integer[] arrayToSort = new Integer[] { val1, val2, val3, val4, val5 };
		Integer[] arrayToSortRef = new Integer[] { val1, val2, val3, val4, val5 };
		// do reverse sorting
		Arrays.sort(arrayToSortRef, Collections.reverseOrder());

		// when
		// do the quick sort
		Sorter<Integer> sort =createSorter(arrayToSort);
		Integer[] sortedArray = sort.sort(SortOrder.DESCENDING);

		// then
		// convert to Integer Array for comparison
		assertArrayEquals(arrayToSortRef, sortedArray);
	}

	@DataPoints
	public static int[] TEST_DATA = { 0, 1, 2, 3, 4, };
}
