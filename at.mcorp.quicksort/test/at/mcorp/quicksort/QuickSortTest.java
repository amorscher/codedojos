package at.mcorp.quicksort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {


	@Test
	public void quickSortTest(){
		Integer[] testDataArray =  new Integer[]{9,1,2,8,3,0,6,4,5,8,7};
		new QuickSort<Integer>(testDataArray);
	}
	
	@Test
	public void sortAscendingTest(){
		Integer[] testDataArray =  new Integer[]{0,9,1,2,3,6,4,5,8,7};
		QuickSort<Integer> sort = new QuickSort<>(testDataArray);
		Integer[] sortedArray = sort.sort(SortOrder.ASCENDING);
		assertArrayEquals(new Integer[]{0,1,2,3,4,5,6,7,8,9}, sortedArray);
	}
	
	@Test
	public void sortAscendingTestSameElements(){
		Integer[] testDataArray =  new Integer[]{0,9,1,2,3,6,4,5,8,7,3,4};
		QuickSort<Integer> sort = new QuickSort<>(testDataArray);
		Integer[] sortedArray = sort.sort(SortOrder.ASCENDING);
		assertArrayEquals(new Integer[]{0,1,2,3,3,4,4,5,6,7,8,9}, sortedArray);
	}
	
	@Test
	public void sortDescendingTest(){
		Integer[] testDataArray =  new Integer[]{0,9,1,2,3,6,4,5,8,7};
		QuickSort<Integer> sort = new QuickSort<>(testDataArray);
		Integer[] sortedArray = sort.sort(SortOrder.DESCENDING);
		assertArrayEquals(new Integer[]{9,8,7,6,5,4,3,2,1,0}, sortedArray);
	}
	
	@Test
	public void sortDescendingTestSameElements(){
		Integer[] testDataArray =  new Integer[]{0,9,1,2,3,6,4,5,8,7,3,4};
		QuickSort<Integer> sort = new QuickSort<>(testDataArray);
		Integer[] sortedArray = sort.sort(SortOrder.DESCENDING);
		
		assertArrayEquals(new Integer[]{9,8,7,6,5,4,4,3,3,2,1,0}, sortedArray);
	}
	
	@Test
	public void sortSameArrayDescendingAndAscendingTest(){
		Integer[] testDataArray =  new Integer[]{0,9,1,2,3,6,4,5,8,7,3,4};
		QuickSort<Integer> sort = new QuickSort<>(testDataArray);
		Integer[] sortedArray = sort.sort(SortOrder.DESCENDING);
		
		assertArrayEquals(new Integer[]{9,8,7,6,5,4,4,3,3,2,1,0}, sortedArray);
		
		sortedArray = sort.sort(SortOrder.ASCENDING);
		assertArrayEquals(new Integer[]{0,1,2,3,3,4,4,5,6,7,8,9}, sortedArray);
	}
	
}
