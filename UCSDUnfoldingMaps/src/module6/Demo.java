package module6;

import java.util.Collections;

import demos.Airport;

public class Demo {
	public int linearSearch(String[] array, String airport) {
		int airportIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(airport)) {
				airportIndex = i;
			}
		}
		return airportIndex;
	}
	
	public String linearSearchSol(String toFind, String[] airports) {
		int index = 0;
		while (index < airports.length) {
			Airport a = airports[index];
			if (toFind.equals(a.getCity())) {
				return a.getCode();
			}
			index++;
		}
		return null;
	}
	
	public String binarySearch(String[] array, String toFind) {
		int low = 0;
		int high = array.length - 1;
		int index = (high+low)/2;
		while (low <= high) {
			Airport curr = array[index];
			if (curr.getCity.equals(toFind)) {
				return curr.getCode();
			}
			if ((curr.getCity()).compareTo(toFind) < 0) {
				high = index-1;
			} else {
				low = index+1;
			}
			
		}
	}
	
	public String binarySearchSol(String toFind, String[] airports) {
		int low = 0;
		int high = airports.length - 1;
		int mid;
		while(low <= high) {
			mid = low + ((high-low)/2) //mid = (low + high)/2; the former protects us against overflow in java when working with very large numbers;
			int compare = toFind.compareTo(airports[mid].getCity());
			if (compare < 0) {
				high = mid - 1;
			} else if (compare > 0) {
				low = mid + 1;
			} else {
				return airports[mid].getCode();
			}
		}
		return null;
	}
	
	public String[] selectionSort(String[] array) {
		String[] sortedArray = new String[array.length];
		String smallest;
		int index;
		int compare;
		for (int i = 0; i < array.length; i++) {
			index = i;
			smallest = array[i];
			for (int j = i; j < array.length; j++) {
				compare = smallest.compareTo(array[j]);
				if (compare <= 0) {
					smallest = array[j];
				}
			}
			sortedArray[index] = smallest;
		}
		return sortedArray;
	}
	
	public static void selectionSortSol(int vals[]) {
		int indexMin;
		for (int i = 0; i < vals.length-1; i++) {
			indexMin = i;
			for (int j = 0; j < vals.length; j++) {
				if (vals[j] < vals[indexMin]) {
					indexMin = j;
				}
			}
		}
		
		swap (vals, indexMin, i;)
	}
	
	public String[] bubbleSort(String[] array) {
		int currIndex = 0;
		int compIndex = currIndex + 1;
		String currString;
		String compString;
		int compare;
		while (currIndex < array.length-1) {
			currString = array[currIndex];
			compString = array[compIndex];
			compare = currString.compareTo(compString);
			if (compare > 0) {
				swap(array, array[currIndex], array[compIndex]);
			}
			currIndex++;
			compIndex++;
		}
	}
	
	public static void insertionSortSol(String[] array) {
		int currInd;
		for (int pos = 1; pos < val.length; pos++) {
			currInd = pos;
			
			while (currInd > 0 && vals[currInd] < vals[currInd-1]) {
				swap(vals, currInd, currInd-1);
				currInd = currInd - 1;
			}
		}
	}
	
	public myBuiltInSortingTest() {
		Random rand = new Random();
		List<Integer> numToSort = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			numsToSort.add(random.nextInt(100));
		}
		Collections.sort(numsToSort);
		System.out.println("New array after builtin sort: "+
							numsToSort.toString());
	}
}
