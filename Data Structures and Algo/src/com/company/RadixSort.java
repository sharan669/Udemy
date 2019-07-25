package com.company;

public class RadixSort {

    public void sort() {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray,10,4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.print(radixArray[i]+ " ");
        }

        System.out.println("");
    }

    public static void radixSort(int[] input, int radix, int width) { //
        for (int i = 0; i < width; i++) { //the width of the number, will go from units , tens and so on
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) { //position here means ten's , hundred or thousand , radix is 10 as there 10 possible digits (0-9)
        int numItems = input.length;
        int[] countArray = new int[radix]; //will hold the count of the digits
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        for(int j=1;j<radix;j++)
            countArray[j]+=countArray[j-1]; //THis is like as per the slides where we increment the count at a given index with the ones of the previous
        // like index two shall contain all the digits 2 or less than 2

        int[] temp = new int[numItems];

        for(int tempIndex= numItems -1;tempIndex>=0;tempIndex--){
            temp[--countArray[getDigit(position,input[tempIndex],radix)]]=
                    input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems;tempIndex++){
            input[tempIndex]=temp[tempIndex];
        }

    }

    public static int getDigit(int position, int value, int radix) {  //returns the digit at given tens, hundread or thousand's position
        return value / (int) Math.pow(10, position) % radix;
    }


}
