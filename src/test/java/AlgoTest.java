package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	
	SortDemoData data = new SortDemoData();
	SortDemoData solution = new SortDemoData();
	
	@Before
	public void setUp() throws Exception {
	}

	//Test Sequence : [8,9,5,3,1,2]
	@Test
	public void ifSort_Bubble() {
		data.initializeArray("8 9 5 3 1 2");
		solution.initializeArray("1 2 3 5 8 9");
		data.runAlgo(0);
		
		assertTrue(data.myArray.length == solution.myArray.length);
		
		int i = 0;
		while(i<data.myArray.length) {
			assertTrue(data.myArray[i].key == solution.myArray[i].key);
			i++;
		}	
	}
	
	//Test Sequence : []
	@Test (expected = java.lang.NullPointerException.class)
	public void ifBubbleSort_Empty() {
		SortAlgos.bubbleSort(null);
	}
	
	//Test Sequence : [8,9,5,3,1,2]
	@Test
	public void ifSort_Selection() {
		data.initializeArray("8 9 5 3 1 2");
		solution.initializeArray("1 2 3 5 8 9");
		data.runAlgo(1);
		
		assertTrue(data.myArray.length == solution.myArray.length);
		
		int i = 0;
		while(i<data.myArray.length) {
			assertTrue(data.myArray[i].key == solution.myArray[i].key);
			i++;
		}	
	}
	
	//Test Sequence : []
	@Test (expected = java.lang.NullPointerException.class)
	public void ifSelectionSort_Empty() {
		SortAlgos.selectionSort(null);
	}
	
	//Test Sequence : [8,9,5,3,1,2]
	@Test
	public void ifSort_Insertion() {
		data.initializeArray("8 9 5 3 1 2");
		solution.initializeArray("1 2 3 5 8 9");
		data.runAlgo(2);
		
		assertTrue(data.myArray.length == solution.myArray.length);
		
		int i = 0;
		while(i<data.myArray.length) {
			assertTrue(data.myArray[i].key == solution.myArray[i].key);
			i++;
		}	
	}
	
	//Test Sequence : []
	@Test (expected = java.lang.NullPointerException.class)
	public void ifInsertionSort_Empty() {
		SortAlgos.insertionSort(null);
	}
	
	//Test Sequence : [8,9,5,3,1,2]
	@Test
	public void ifSort_Merge() {
		data.initializeArray("8 9 5 3 1 2");
		solution.initializeArray("1 2 3 5 8 9");
		data.runAlgo(3);
		
		assertTrue(data.myArray.length == solution.myArray.length);
		
		int i = 0;
		while(i<data.myArray.length) {
			assertTrue(data.myArray[i].key == solution.myArray[i].key);
			i++;
		}	
	}
	
	//Test Sequence : []
	@Test (expected = java.lang.NullPointerException.class)
	public void ifMergeSort_Empty() {
		SortAlgos.mergeSort(null);
	}
	
	//Test Sequence : [8,9,5,3,1,2]
	@Test
	public void ifSort_Heap() {
		data.initializeArray("8 9 5 3 1 2");
		solution.initializeArray("1 2 3 5 8 9");
		data.runAlgo(5);
		
		assertTrue(data.myArray.length == solution.myArray.length);
		
		int i = 0;
		while(i<data.myArray.length) {
			assertTrue(data.myArray[i].key == solution.myArray[i].key);
			i++;
		}	
	}
	
	//Test Sequence : []
	@Test (expected = java.lang.NullPointerException.class)
	public void ifHeapSort_Empty() {
		SortAlgos.heapSort(null);
	}
	
	//Test Sequence : [8,9,5,3,1,2]
	@Test
	public void ifSort_Quick() {
		data.initializeArray("8 9 5 3 1 2");
		solution.initializeArray("1 2 3 5 8 9");
		data.runAlgo(4);
		
		assertTrue(data.myArray.length == solution.myArray.length);
		
		int i = 0;
		while(i<data.myArray.length) {
			assertTrue(data.myArray[i].key == solution.myArray[i].key);
			i++;
		}	
	}
	
	//Test Sequence : []
	@Test (expected = java.lang.NullPointerException.class)
	public void ifQuickSort_Empty() {
		SortAlgos.quickSort(null);
	}
}