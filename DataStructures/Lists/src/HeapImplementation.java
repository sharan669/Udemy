public class HeapImplementation {

    public void heapImplementation(){

        Heap heap = new Heap(10);
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.heapSort();

      /*  System.out.println("-----------");

        heap.delete(0);

        heap.printHeap();

        System.out.println("-----------");

        System.out.println("Peak :" + heap.peek());*/



    }


}
