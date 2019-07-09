package com.company;

public class SelectionSort {


    /* Select  the maximum and swap it with the last element is the unsorted part



    */


    public void show(int a[]) {
        int size = a.length, unsortedIndex = size - 1, maxElementIndex, temp;

        System.out.println("Given array is ");

        for(int m=0;m<size;m++){
            System.out.print(a[m]+" ");
        }

        for(int i=0;i<size-1;i++){
            maxElementIndex = 0;
            for(int j=1;j<=unsortedIndex;j++){
                if(a[j]>a[maxElementIndex]){
                    maxElementIndex = j;
                }
            }

            if(unsortedIndex!= maxElementIndex){
                temp = a[unsortedIndex];
                a[unsortedIndex] = a[maxElementIndex];
                a[maxElementIndex] = temp;
            }
            System.out.println("The during selection sort");
            for(int m=0;m<size;m++){
                System.out.print(a[m]+" ");
            }
            unsortedIndex --;

        }

        System.out.println("The array after selection sort is");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }


    }


}
