import java.util.Arrays;

/*
Heap is basically a binary complete tree and is unsorted. max heap is one in which all the root is greater than its children
the opposite is min heap.

heap is killer when it comes to access the largest or tge smallest value - O(1)

It is not good for searching elements

Insertion takes O(1 * logn) where O(1) for inserting into the array and O(log n) for heapifying

Deletiion takes O(n * logn) where O(n) for finding where the element is and O(log n) for heapyfying
*/



public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) { //just insert like an array
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }


    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) { //this is the formula for the parent
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        if (left == true)
            return (2 * index) + 1;//this is the formula for the left child
        else
            return (2 * index) + 2; //this is the formula for the right child
    }

    public int delete(int index) { //the index that needs to be deleted
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index); //get the parent value
        int deletedValue = heap[index];

        heap[index] = heap[size - 1]; //the node that needs to be used for swapping, the right most node of the leaves

        if (index == 0 || heap[index] < heap[parent]) { //if it holds the max heap properties
            fixHeapBelow(heap, index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        heap[size-1]=0;
        size--;

        return deletedValue;
    }


    private void fixHeapAbove(int index) { //when the heap is a max heap, you may have
        //to reorder it, the element added may have to be swapped
        int newValue = heap[index]; //the given value that needs to be rerdered
        while (index > 0 && heap[getParent(index)] < newValue) { //if parent is smaller
            heap[index] = heap[getParent(index)]; //swap
            index = getParent(index);
        }
        heap[index] = newValue; //put the final value in the correct position
    }

    private void fixHeapBelow(int heap1[],int index, int lastHeapIndex) {
        int[] heap = heap1;
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild < lastHeapIndex) { //index its not the value, just to make sure that it has a left child
                if (rightChild > lastHeapIndex) { //if it doesn't have a right child
                    childToSwap = leftChild; //hold on to the index of the left
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                    //if it has two childs, then choose the ma one
                }

                if (heap[index] < heap[childToSwap]) { //swap with the max
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                } else {
                    break; //everything cool, then break it
                }
                index = childToSwap; //rinse with the next value
            } else {
                break;
            }
        }

    }

    public void heapSort(){

        int[] heapArray = heap;
        int currentLastIndex = size-1;

        while(currentLastIndex > 1){
            int temp= heapArray[currentLastIndex];
            heapArray[currentLastIndex] = heap[0];
            heap[0] = temp;
            currentLastIndex --;
            fixHeapBelow(heapArray,0,currentLastIndex);
        }

        System.out.println("The sorted heap is " + Arrays.toString(heapArray));
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + Arrays.toString(heap) +
                '}';
    }

    public void printHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i]+" ");
        System.out.println("\n");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("The heap is empty to look into");
        return heap[0];
    }


}
