package com.company;



public class BubbleSort {


        public void show(int a[]) {
            int temp;
            int size = a.length;

        for(int i=0;i<size;i++){

            for(int j=0;j<(size-i-1);j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }}

            System.out.println("the array after bubble sort is ");
            for(int j=0;j<(size);j++) {
                System.out.print    (a[j]+" ");
            }





    }

}
