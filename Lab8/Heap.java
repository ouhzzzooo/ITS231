package Lab8;

public class Heap {
	
	/** The current number of elements in the heap. */
	int load = 0;
	
	/** The array representing the heap. */
	int[] hArray = new int[100];

	/**
     * Constructs an empty heap.
     */
	Heap() {
	}

	/**
     * Performs the reheapUp operation to maintain the heap property after insertion.
     *
     * @param currentIndex The index of the current element.
     */
	void reheapUp(int currentIndex) {
		 // Exercise 1
		//  add your code here 
		if(currentIndex > 0) {
			double pi = Math.floor((currentIndex-1)/2);
			if(pi < currentIndex) {
				swap(hArray,(int) pi, currentIndex);
			}
			reheapUp((int) pi);
		}
	}

	/**
     * Inserts a new element into the heap and performs the necessary reheapUp operation.
     *
     * @param data The data to be inserted into the heap.
     */
	void insert(int data) {
		// Exercise 2
		// add your code here 
		hArray[load] = data;
		load++;
		reheapUp(load - 1);
	}

	 /**
     * Performs the reheapDown operation to maintain the heap property after deletion.
     *
     * @param currentIndex The index of the current element.
     */
	void reheapDown(int currentIndex) {
		// Exercise 3
		// add your code here 
		int lastIndex = load-1;
		int largest;
		if(2*currentIndex + 1 <= lastIndex) {
			int lChild = 2*currentIndex+1;
			int rChild = 2*currentIndex+2;
			if(rChild > lastIndex) {
				largest = lChild;
			}
			else if(hArray[rChild] > hArray[lChild]) {
				largest = rChild;
			}
			else {
				largest = lChild;
			}
			if(hArray[currentIndex] < hArray[largest]) {
				swap(hArray,currentIndex,largest);
				reheapDown(largest);
			}
		}
	}

	/**
     * Deletes the root element of the heap and performs the necessary reheapDown operation.
     *
     * @return The value of the root element that was deleted.
     */
	int deleteRoot() {
		// Exercise 4
		// add your code here 
		int temp = hArray[0];
		if(load - 1 >= 0) {
			hArray[0] = hArray[load-1];
			hArray[load-1] = 0;
			load--;
			reheapDown(0);
		}
		return temp;
	}

	/**
     * Sorts the heap in ascending order.
     */
	void makeHeapSort() {
		// Exercise 5
		// add your code here 
		while(load > 0) {
			System.out.print(deleteRoot()+ " ");
		}
	}

	/**
     * Finds the level of a given node in the heap.
     *
     * @param nodeIndex The index of the node.
     * @return The level of the node in the heap.
     */
	int findLevel(int nodeindex) {
		int parent = (nodeindex - 1) / 2;
		int level = 0;

		if (parent > 0)
			level++;

		while (parent > 0) {
			parent = (parent - 1) / 2;
			level++;
		}
		return level;
	}

	/**
     * Swaps two elements in the heap array.
     *
     * @param A The heap array.
     * @param ind1 The index of the first element to be swapped.
     * @param ind2 The index of the second element to be swapped.
     */
	void swap(int[] A, int ind1, int ind2) {
		int temp = A[ind1];
		A[ind1] = A[ind2];
		A[ind2] = temp;
	}

	/**
     * Prints the elements of the heap array.
     */
	void printHeapArray() {
		for (int i = 0; i < load; i++)
			System.out.print(hArray[i] + " ");
		System.out.println();
	}

}