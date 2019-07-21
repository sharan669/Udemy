package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    public void bucketSortImplementation() {

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {  //create buckets
            //using linked list for the bucket
            buckets[i] = new LinkedList<>();

            //using the array list as the bucket
//            buckets[i] = new ArrayList<>();

        }

        for (int i = 0; i < input.length; i++) {   //has the values
            buckets[hash(input[i])].add(input[i]);
        }

        for(List bucket: buckets){
            Collections.sort(bucket); //uses merge sort  //sort each bucket
        }

        int j=0;
        for(int i=0;i<buckets.length;i++){  //copy the sorted array back to a new array

            for(int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    private static int hash(int value){ //hashing function
        return value / (int) 10;

    }


}


