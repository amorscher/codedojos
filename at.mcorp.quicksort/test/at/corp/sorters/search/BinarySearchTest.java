package at.corp.sorters.search;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import at.mcorp.sorters.search.BinarySearch;

/**
 * 
 * @author ambros
 * Tests {@link BinarySearch} class
 */
public class BinarySearchTest {

	@Test
	public void binarySearch_RecTest() {
		Integer[] sortedArray =  new Integer[]{0,1,2,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Rec(sortedArray,3);
		assertThat(foundIndex, is(3));
	}
	@Test
	public void binarySearch_RecLastElementTest() {
		Integer[] sortedArray =  new Integer[]{0,1,2,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Rec(sortedArray,9);
		assertThat(foundIndex, is(9));
	}
	
	@Test
	public void binarySearch_RecNotFoundTest() {
		Integer[] sortedArray =  new Integer[]{0,1,2,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Rec(sortedArray,1111);
		assertThat(foundIndex, is(BinarySearch.NOT_FOUND_INDEX));
	}
	
	@Test
	public void binarySearch_RecNotFoundTest1() {
		Integer[] sortedArray =  new Integer[]{0,1,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Rec(sortedArray,2);
		assertThat(foundIndex, is(BinarySearch.NOT_FOUND_INDEX));
	}
	
	@Test
	public void binarySearch_IteTest() {
		Integer[] sortedArray =  new Integer[]{0,1,2,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Ite(sortedArray,3);
		assertThat(foundIndex, is(3));
	}
	@Test
	public void binarySearch_IteLastElementTest() {
		Integer[] sortedArray =  new Integer[]{0,1,2,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Ite(sortedArray,9);
		assertThat(foundIndex, is(9));
	}
	
	@Test
	public void binarySearch_IteNotFoundTest1() {
		Integer[] sortedArray =  new Integer[]{0,1,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Ite(sortedArray,2);
		assertThat(foundIndex, is(BinarySearch.NOT_FOUND_INDEX));
	}
	
	@Test
	public void binarySearch_IteNotFoundTest() {
		Integer[] sortedArray =  new Integer[]{0,1,2,3,4,5,6,7,8,9};
		int foundIndex = BinarySearch.binarySerach_Ite(sortedArray,1111);
		assertThat(foundIndex, is(BinarySearch.NOT_FOUND_INDEX));
	}
}
