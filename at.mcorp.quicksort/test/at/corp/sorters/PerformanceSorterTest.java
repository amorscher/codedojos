package at.corp.sorters;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import at.mcorp.sorters.SortOrder;
import at.mcorp.sorters.Sorter;

public abstract class PerformanceSorterTest extends AbstractSorterTest {

	public static final int NUMBER_OF_VALUES_TO_INSERT = 10000;

	@Test
	public void performanceTest() {
		Random randomNumberGen = new Random();
		Integer[] arrayToSort = new Integer[NUMBER_OF_VALUES_TO_INSERT];
		for (int i = 0; i < NUMBER_OF_VALUES_TO_INSERT; i++) {
			arrayToSort[i] = randomNumberGen.nextInt(130);
		}
		Sorter<Integer> sorter = createSorter(arrayToSort);
		Integer[] arrayToSortRef = Arrays.copyOf(arrayToSort, NUMBER_OF_VALUES_TO_INSERT);
		Arrays.sort(arrayToSortRef);
		long startTime = System.currentTimeMillis();
		sorter.sort(SortOrder.ASCENDING);
		long endTime = System.currentTimeMillis();
		System.out.println("Time needed for sorting an array of " + NUMBER_OF_VALUES_TO_INSERT + " integers using "
				+ sorter.getClass().getCanonicalName() + " :" + (endTime - startTime));

		// then
		assertArrayEquals(arrayToSortRef, arrayToSort);
	}

}
