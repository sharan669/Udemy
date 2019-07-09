package com.company;

public class InsertionSort {

    /*

    Array is devided into sorted and unsorted part
    An element is picked up from the unsorted and iserted wherever required in unsorted
     */



    public void sort(int a[]){

        int size = a.length;

        int unsortedIndex=1,  valueToBeInserted,j;

        while(unsortedIndex < size){   //unsorted is the front most index, it neeeds to be incremented until the size-1


                valueToBeInserted = a[unsortedIndex];
                j = unsortedIndex-1;
                while (j>=0 && (a[j] > valueToBeInserted)) {
                    a[j + 1] = a[j]; //push the elements front
                    j--;
                }
                a[j + 1] = valueToBeInserted; //elment is inserted

            unsortedIndex ++;
        }

        System.out.println("the array after insertion sort is ");
        for(j=0;j<(size);j++) {
            System.out.print    (a[j]+" ");
        }

    }



}
