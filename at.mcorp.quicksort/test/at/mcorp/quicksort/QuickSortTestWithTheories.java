package at.mcorp.quicksort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * Test class for the {@link QuickSort} class by using {@link Theories} to
 * create a combination of integer values
 * 
 * @author ambros
 *
 */
@RunWith(Theories.class)
public class QuickSortTestWithTheories {

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
		QuickSort<Integer> sort = new QuickSort<>(arrayToSort);
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
		QuickSort<Integer> sort = new QuickSort<>(arrayToSort);
		Integer[] sortedArray = sort.sort(SortOrder.DESCENDING);

		// then
		// convert to Integer Array for comparison
		assertArrayEquals(arrayToSortRef, sortedArray);
	}

	@DataPoints
	public static int[] TEST_DATA = { 0, 1, 2, 3, 4, };
}
