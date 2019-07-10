package com.company;

public class QuickSort {

    public void sort(int a[]){

        int size=a.length;

        System.out.println("\nThe given array for quick sort is ");
        for (int j = 0; j < (size); j++) {
            System.out.print(a[j] + " ");
        }

        quickSort(0,a.length,a);


        System.out.println("\nthe array after quick sort is ");
        for(int j=0;j<(size);j++) {
            System.out.print    (a[j]+" ");
        }
    }

    public void quickSort(int start,int end, int a[]){

        if(end-start < 2) //break condition - if the size of the array is less than 2 then break
            return;

        int pivot = findPivot(start, end,a); /*at each step of sorting, the pivot will be calculated, then
        the array on the left should go though quick sort recursively
        */
        quickSort(start, pivot,a);  //array until the pivot, not including int
        quickSort(pivot+1 ,end,a);  //array until after the pivot and till the end

    }

    public int findPivot(int start,int end,int a[]){

        int i=start,j=end,pivot=a[start];

        while(j>i){
            while(i<j && a[--j]>=pivot); // continuously decrement j until it finds an element which is smaller than pivot
            if(i<j){
                a[i]=a[j];  //at the ith position put the elemnt that is found in jth and is smaller than pivot
            }
            while (i<j && a[++i]<=pivot);// continuously increment i until it finds an element which is greater than pivot
            if(i<j){
                a[j]=a[i]; //at the jth position put the element that is found in ith and is greater than pivot
            }
        }
        a[j]=pivot;
return j;
    }

}
