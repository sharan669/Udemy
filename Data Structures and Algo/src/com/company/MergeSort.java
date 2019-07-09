package com.company;

public class MergeSort {

    public  void sort(int a[]) {

        int size=a.length;

        System.out.println("\nThe given array of merge sort is ");
        for (int j = 0; j < (size); j++) {
            System.out.print(a[j] + " ");
        }

        mergeSort(0,a.length,a);


        System.out.println("\nthe array after merge sort is ");
        for(int j=0;j<(size);j++) {
            System.out.print    (a[j]+" ");
        }

    }

          public void mergeSort(int start, int end, int a[]){
            if(end - start < 2){  //break condition, if its just an element, then you cant break it more
                return;
            }
            int mid = (start+end)/2;
            mergeSort(start,mid,a); //left array - from start to end
            mergeSort(mid,end,a); // right array - from mid to end

            merge(a, start, end, mid);  // for merging
          }

        public void merge(int a[], int start, int end, int mid){

            int[] temp= new int[end-start] ; // temporary array to copy the elements
            int i=start,j=mid,index=0;
            if(a[mid-1]>a[mid]) {
                while ((i < mid) && (j < end)) {
                 temp[index++]=(a[i]<a[j])?a[i++]:a[j++]; //copying the elements
                }
                System.arraycopy(a,i,a,start+index,mid-i); /*if the right array is left out with some elements
                then don't bother about it because it will already be in the original array

                what matters is copying the remaining elements from the right array into the temp array
                */
                System.arraycopy(temp,0,a,start,index); //here copy the remaining elements of temp to original array
            }
        }

     }






