package com.sortingAlgos;

public class SelectionSort extends Sort {

    private int[] array ;
    //sorted array to the left and unsorted to the right.
    // N^2 to N^2 and stable
    // take one compare with all to the right. Starting from 0th element, swap with the smallest or biggest element.

    private SelectionSort(int[] array) {
        super(array);
        this.array = array;
    }

    @Override
    public int[] sort(){

        int tempData;
        int tempIndex;
        for (int i = 0; i < array.length -1 ; i++){
            tempData = array[i];
            tempIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < tempData){
                    tempData = array[j];
                    tempIndex = j;
                }
            }
            array[tempIndex] = array[i];
            array[i] = tempData;
        }
        return this.array;
    }

    @Override
    public void printArray(int[] arr){
        super.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arra = {4 ,7 ,5 ,3, 9, 2};
        SelectionSort sort = new SelectionSort(arra);
        sort.printArray(sort.sort());
        int[] arra2 = {13, 19, 43, 57, 22, 6, 74};
        sort = new SelectionSort(arra2);
        sort.printArray(sort.sort());
    }

}
