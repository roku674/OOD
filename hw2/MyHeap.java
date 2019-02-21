package hw2;

public class MyHeap {
	int[] heap;
	int heapSize;
	
	MyHeap() {
		heap = new int[100];
	 heapSize = 0;
	}
	
	public void insert(int val){
		/*heap[heapSize] = val;
		upHeap(heapSize);
		heapSize++;*/
		MyHeap newHeap = new MyHeap();
		if (heapSize == heap.length) {
			System.out.println("Heap's underlying storage is overflowed");
		}
      else {
            heapSize++;
            heap[heapSize] = val;
            upHeap(heapSize);
      }
	}
	
	 private void downHeap(int nodeIndex) {
         int LeftCI, rightCI, minIndex, tmp;
         LeftCI = getLeft(nodeIndex);
         rightCI = getRight(nodeIndex);
         if (rightCI >= heapSize) {
               if (LeftCI >= heapSize)
                     return;
               else
                     minIndex = LeftCI;
         } else {
               if (heap[LeftCI] <= heap[rightCI])
                     minIndex = LeftCI;
               else
                     minIndex = rightCI;
         }
         if (heap[nodeIndex] > heap[minIndex]) {
               tmp = heap[minIndex];
               heap[minIndex] = heap[nodeIndex];
               heap[nodeIndex] = tmp;
               //downHeap(minIndex);
         }
	 }
	void upHeap(int index) {
		while  (index >= 1 && heap[index] < heap[index / 2]) {
			swap(index, index /2);
		}
	}
	
	void swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}
	
	public int getLeft(int nodeIndex)
	{
		return 2 *nodeIndex + 1;
	}
	
	public int getRight(int nodeIndex){
		return 2 * nodeIndex + 2;
	}
	
	public boolean isEmpty(){
		// are you empty? 
		return (heapSize != 0);
		// if empty say false if not say true
	}
	
	public void heapSize(){}
	
	public int getKey(int key){
	  return key;
		}
	
	
	public void min(int heapSize){
		heap = new int[heapSize];
        heapSize = 0;
	}
	
  public void removeMin() {
	if (isEmpty()) {
		heap[0] = heap[heapSize - 1];
    	heapSize--;
    	downHeap(0);
	}
	else {
		 System.out.println("Heap is empty");
	}
  }

	public createLinear(){}
	public createNonLinear(){}
	

}
