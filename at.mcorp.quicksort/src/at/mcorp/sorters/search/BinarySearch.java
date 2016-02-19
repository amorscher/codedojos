package at.mcorp.sorters.search;

/**
 * Class offers utility methods which implement the binary search algorithm.
 * Recursive and iterative.
 * @author ambros
 *
 */
public final class BinarySearch {

	public static final int NOT_FOUND_INDEX = -1;

	private BinarySearch() {
		//helper class for doing the search
	}

	public static  <T extends Comparable<T>> int binarySerach_Rec(T[] sortedArray, T elementToFind){
		return binarySearch_Rec(sortedArray,elementToFind,0,sortedArray.length-1);	
	}

	private static <T extends Comparable<T>> int binarySearch_Rec(T[] sortedArray, T elementToFind, int fromIndex, int toIndex) {
		if (fromIndex>toIndex){
			return NOT_FOUND_INDEX;
		}
		int splitIndex = fromIndex+(toIndex-fromIndex)/2;
		
		if (elementToFind.compareTo(sortedArray[splitIndex])<0){
			return binarySearch_Rec(sortedArray,elementToFind,fromIndex,splitIndex-1);
		}else if (elementToFind.compareTo(sortedArray[splitIndex])>0){
			return binarySearch_Rec(sortedArray,elementToFind,splitIndex+1,toIndex);
		}else{
			//element has been found
			return splitIndex;
		}
	}
	
	public static  <T extends Comparable<T>> int binarySerach_Ite(T[] sortedArray, T elementToFind){
		int low = 0;
		int high = sortedArray.length-1;
		
		while(low <=high){
			int splitIndex = low+(high-low)/2;
			if (elementToFind.compareTo(sortedArray[splitIndex])<0){
				high=splitIndex-1;
			}else if (elementToFind.compareTo(sortedArray[splitIndex])>0){
				low = splitIndex+1;
			}else{
				//element has been found
				return splitIndex;
			}
		}	
		return NOT_FOUND_INDEX;	
	}

}
