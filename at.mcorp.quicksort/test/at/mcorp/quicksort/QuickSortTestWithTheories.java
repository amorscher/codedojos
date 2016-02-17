package at.mcorp.quicksort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

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
	public void sortAscendingTest(int val1, int val2, int val3, int val4, int val5) {
		// given
		// array of data to sort
		int[] arrayToSort = new int[] { val1, val2, val3, val4, val5 };
		int[] arrayToSortRef = new int[] { val1, val2, val3, val4, val5 };
		// sort the arrayToSortRef by the jdk default sorting implementation
		Arrays.sort(arrayToSortRef);

		// when
		// do the quick sort
		QuickSort sort = new QuickSort(arrayToSort);
		int[] sortedArray = sort.sort(SortOrder.ASCENDING);

		// then
		assertArrayEquals(arrayToSortRef, sortedArray);
	}

	@Theory
	public void sortDedcendingTest(int val1, int val2, int val3, int val4, int val5) {
		// given
		// array of data to sort
		int[] arrayToSort = new int[] { val1, val2, val3, val4, val5 };
		Integer[] arrayToSortRef = new Integer[] { val1, val2, val3, val4, val5 };
		// do reverse sorting
		Arrays.sort(arrayToSortRef, Collections.reverseOrder());

		// when
		// do the quick sort
		QuickSort sort = new QuickSort(arrayToSort);
		int[] sortedArray = sort.sort(SortOrder.DESCENDING);

		// then
		// convert to Integer Array for comparison
		Integer[] sortedArrayOfIntegers = IntStream.of(sortedArray).boxed().toArray(Integer[]::new);
		assertArrayEquals(arrayToSortRef, sortedArrayOfIntegers);
	}

	@DataPoints
	public static int[] TEST_DATA = { 0, 1, 2, 3, 4, };
}
