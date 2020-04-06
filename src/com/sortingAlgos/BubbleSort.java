package com.sortingAlgos;

public class BubbleSort extends Sort {

    private int[] array ;
    //sorted array to the right and unsorted to the left.
    // N to N^2 and stable.
    // take one compare with the next. Push the largest/smallest number to the right end.

    private BubbleSort(int[] array) {
        super(array);
        this.array = array;
    }

    @Override
    public int[] sort(){
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j+1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    private int[] recursiveSort (int[] arr, int size){
        if(size == 1)
            return arr;
        int temp;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        recursiveSort(arr, size - 1);
        return arr;
    }

    public static void main (String[] args) {
        int[] arra = {13, 19, 43, 57, 22, 6, 74};
        int[] arra2 = {4 ,7 ,5 ,3, 9, 2};
        BubbleSort sort = new BubbleSort(arra2);
        sort.printArray(sort.sort());
        BubbleSort sort2 = new BubbleSort(arra);
        sort2.printArray(sort2.recursiveSort(arra, 7));
    }

    @Override
    public void printArray (int[] arr){
        super.printArray(arr);
    }
}
