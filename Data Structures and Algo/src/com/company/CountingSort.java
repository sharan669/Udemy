package com.company;


// O(n) complexity

public class CountingSort {

    public void doCountSort(){

        int[] a={7,7,8,10,2,2,2,2,3,1,1}; //it holds the values ranging from 1 to 10
        int min=1,max=10; //range
        int[] count=new int[10];
        int size=a.length;
        System.out.println("count array:");
        for(int i=0;i<10;i++){
            System.out.print(count[i]+" ");
        }

        for(int i=0;i<size;i++)
            count[a[i]-min]+=1;    /*increment the count array, the element - 1's count is stored
        in the count's 0 index , 2 in index 1 as so on
*/
        int index=0;

        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){  //based on the values stored in the count, write into the array a
                a[index++]=i+min;
            }
        }

        System.out.println("The array after counting sort is");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

    }
}
