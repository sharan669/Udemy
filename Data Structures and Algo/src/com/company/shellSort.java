package com.company;

public class shellSort {

/*

Added advantage is that insertion sort is almost linear when the array is almost sorted, so it helps a lot

 */


    public void sort(int a[]){

        int size = a.length,i, temp=0;

        System.out.println("\nthe given array for shell sort is ");
        for(int j=0;j<(size);j++) {
            System.out.print(a[j]+" ");
        }
        for(int gap = size/2;gap>0;gap=gap/2){   //gap is usually taken as size / 2


      for(int j=gap;j<size;j++){ //j starts from the gap number  and interated one by one till the last
          i=j;
          temp = a[i];
          while(i>=gap  && (temp < a[i-gap])){  // shift the elements like insertion sort but within the gap wise
              a[i]=a[i-gap];
              i=i-gap;
          }
          a[i]= temp;

          System.out.println("\nthe array during shell sort is ");
          for(int m=0;m<(size);m++) {
              System.out.print    (a[m]+" ");
          }

      }
        }


        System.out.println("\nthe array after shell sort is ");
        for(int j=0;j<(size);j++) {
            System.out.print    (a[j]+" ");
        }


    }


}
