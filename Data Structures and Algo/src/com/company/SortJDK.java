package com.company;

import java.util.Arrays;

public class SortJDK {

    public void sortJDK(){

        int[] intArray = {20,35,-15,7,55,1,-22};

      //  Arrays.sort(intArray);
            Arrays.parallelSort(intArray);
        System.out.println(Arrays.toString(intArray));

    }


}
