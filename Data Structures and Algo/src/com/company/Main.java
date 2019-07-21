package com.company;

public class Main {

    public static void main(String[] args) {

        /*int[] intArray= new int[7];
        intArray[0]=20;
        intArray[1]=35;
        intArray[2]=-10;
        intArray[3]=22;
        intArray[4]=100;

        System.out.println("Input array is");

        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]+ " ");
        }

        //disadvantage - finding the element not given the index, so we end up searching for it

        int index=-1;




        int[] bubbleArray = new int[7];

        for(int i=0;i<bubbleArray.length;i++){
            bubbleArray[i]=intArray[i];
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.show(bubbleArray);


        int[] selectionSortArray = new int[7];

        for(int i=0;i<bubbleArray.length;i++){
            selectionSortArray[i]=intArray[i];
        }
        SelectionSort selectionSort= new SelectionSort();
        selectionSort.show(selectionSortArray);



        int[] insertionSortArray = new int[7];

        for(int i=0;i<insertionSortArray.length;i++){
            insertionSortArray [i]=intArray[i];
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(insertionSortArray);


        int[] shellSortArray = new int[7];

        for(int i=0;i<shellSortArray.length;i++){
            shellSortArray [i]=intArray[i];
        }
        shellSort shellSort1 = new shellSort();
        shellSort1.sort(shellSortArray);

        int[] mergeSortArray = new int[7];

        for(int i=0;i<mergeSortArray.length;i++){
            mergeSortArray [i]=intArray[i];
        }
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(mergeSortArray);


        int[] quickSortArray = new int[7];

        for(int i=0;i<quickSortArray.length;i++){
            quickSortArray [i]=intArray[i];
        }
        QuickSort quickSort = new QuickSort();
        quickSort.sort(quickSortArray);

    CountingSort countSort= new CountingSort();
    countSort.doCountSort();*/

    BucketSort bucketSort = new BucketSort();
    bucketSort.bucketSortImplementation();

    }
}
